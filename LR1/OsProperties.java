public class OsProperties {
    public static void main(String[] args) {
        // Отобразить системные свойства
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String osArch = System.getProperty("os.arch");

        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");

        System.out.println("Операционная система: " + osName + " " + osVersion + " " + osArch);
        System.out.println("Версия Java: " + javaVersion);
        System.out.println("Поставщик Java: " + javaVendor);
    }

}
