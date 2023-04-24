package Controller;

import Model.Map;

public class MapController {
    public static final String BACKGROUND_RESET = "\033[0m";             //reset
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";   // LIGHT BLUE
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// LIGHT RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// LIGHT GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// LIGHT YELLOW
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    
    
    //extra colors:
//    public static final String BLACK_BACKGROUND = "\033[40m";   // BLACK
//    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
//    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE
//    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
//    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
//    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
    
    public String showMap(Map map) {
        int mapLength = map.getLength();
        int mapWidth = map.getWidth();
        String mapView = "";
        for (int i = 0; i < mapLength; i++) {
            for (int j = 0; j < mapWidth; j++) {
                switch (map.getCells()[i][j].getMaterial()) {
                    case "ironLand":
                        mapView += RED_BACKGROUND + "#" + BACKGROUND_RESET;
                        break;
                    case "rockLand":
                        mapView += BLACK_BACKGROUND_BRIGHT + "#" + BACKGROUND_RESET;
                        break;
                    case "sea":
                        mapView += BLUE_BACKGROUND + "#" + BACKGROUND_RESET;
                        break;
                    case "lowWater":
                        mapView += BLUE_BACKGROUND_BRIGHT + "#" + BACKGROUND_RESET;
                        break;
                    case "grass":
                        mapView += GREEN_BACKGROUND_BRIGHT + "#" + BACKGROUND_RESET;
                        break;
                    case "jolge":
                        mapView += GREEN_BACKGROUND + "#" + BACKGROUND_RESET;
                        break;
                    case "castle":
                        mapView += PURPLE_BACKGROUND + "#" + BACKGROUND_RESET;
                        break;
                    case "beach":
                        mapView += YELLOW_BACKGROUND_BRIGHT + "#" + BACKGROUND_RESET;
                        break;
                    default:
                        mapView += YELLOW_BACKGROUND + "#" + BACKGROUND_RESET;
                        break;
                }
            }
        }
        return mapView;
    }
}