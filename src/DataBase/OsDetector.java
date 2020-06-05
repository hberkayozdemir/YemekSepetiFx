package DataBase;

public class OsDetector {
        private static String OS = System.getProperty("os.name").toLowerCase();

    public OsDetector() {      // bos
    }

    public String OsDetected(){
            if(isWindows()){
                return "win";

            }
            else if(isMac()){
                return "osx";

            }
            else if(isUnix()){
                return "linux";
            }

            else{
                return null;
            }
        }

        public static boolean isWindows() {
            return (OS.indexOf("win") >= 0);
        }
        public static boolean isMac() {
            return (OS.indexOf("mac") >= 0);
        }
        public static boolean isUnix() {
            return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
        }

    }
