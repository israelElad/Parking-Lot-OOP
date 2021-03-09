package Parking;

import Vehicles.VehicleType;

import java.util.*;

public class ParkingLevelsCollectionFactory {
    private static int NUM_OF_LEVELS = 10;
    private static int NUM_OF_SPOT_TYPES = ParkingSpotType.values().length;
    private static int NUM_OF_SPOTS_PER_SPOT_TYPE = 100;

    public static ParkingLevelsCollection createParkingLevelsCollection() {
        ParkingLevelsCollection levels =
                new ArrayListParkingLevelsCollection();
        int parkingSpotID = 0;
        int parkingLevelID = 0;
        for (int i=0; i<NUM_OF_LEVELS; i++) {
            Map<ParkingSpotType, Collection<ParkingSpot>> allSpotsForLevel = generateSpots(parkingLevelID, parkingSpotID);

            VehicleToParkingSpotTypeMapper vehicleToSpotTypesMapper = typesMapper();
            ParkingLevel parkingLevel = new CParkingLevel(parkingLevelID, allSpotsForLevel,
                    vehicleToSpotTypesMapper);
            levels.add(parkingLevel);
            parkingSpotID += NUM_OF_SPOT_TYPES * NUM_OF_SPOTS_PER_SPOT_TYPE;
            parkingLevelID++;
        }
        return levels;
    }

    private static VehicleToParkingSpotTypeMapper typesMapper() {
        Map<VehicleType, Collection<ParkingSpotType>> typesMapper =
                new HashMap<>();
        typesMapper.put(VehicleType.MOTORCYCLE,
                Arrays.asList(ParkingSpotType.MOTORCYCLE,
                        ParkingSpotType.COMPACT,
                        ParkingSpotType.LARGE));
        typesMapper.put(VehicleType.CAR,
                Arrays.asList(ParkingSpotType.COMPACT, ParkingSpotType.LARGE));
        typesMapper.put(VehicleType.TRUCK,
                Arrays.asList(ParkingSpotType.LARGE));
        VehicleToParkingSpotTypeMapper vehicleToSpotTypesMapper = new VehicleToParkingSpotTypeMapper() {
            @Override
            public Collection<ParkingSpotType> getPossibleParkingSpotTypes(VehicleType vehicleType) {
                return typesMapper.get(vehicleType);
            }
        };
        return vehicleToSpotTypesMapper;

    }

    private static Map<ParkingSpotType, Collection<ParkingSpot>> generateSpots(int parkingLevelID, int parkingSpotID) {
        Map<ParkingSpotType, Collection<ParkingSpot>> allSpotsForLevel = new HashMap<>();
        for (ParkingSpotType parkingSpotType : ParkingSpotType.values()) {
            Collection<ParkingSpot> spotsForLevel = new ArrayList<>();
            for (int i = 0; i < NUM_OF_SPOTS_PER_SPOT_TYPE; i++) {
                spotsForLevel.add(new ParkingSpot(parkingSpotID,
                        parkingLevelID, parkingSpotType));
                parkingSpotID++;
            }
            allSpotsForLevel.put(parkingSpotType, spotsForLevel);
        }
        return allSpotsForLevel;
    }
}
