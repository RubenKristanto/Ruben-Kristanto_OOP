public class Topology {
    public void addRouterV4(NetworkDeviceBuilder builder, String deviceName, String ipV4, Module module){
        builder.setModelName("Netlab Router");
        builder.setDeviceName(deviceName);
        builder.setIpV4(ipV4);
        builder.setMacAddress(NetworkDevice.randomMACAddress());
        NetworkDevice.addModule(module);
    }

    public void addSwitch(NetworkDeviceBuilder builder, String devicename, int vlan){
        builder.setModelName("Netlab Switch");
        builder.setDeviceName(devicename);
        builder.setMacAddress(NetworkDevice.randomMACAddress());
        builder.setVlan(vlan);
    }

    public void addPCv4(NetworkDeviceBuilder builder, String devicename, String ipv4, Module module){
        builder.setModelName("Netlab PC");
        builder.setDeviceName(devicename);
        builder.setMacAddress(NetworkDevice.randomMACAddress());
        builder.setIpV4(ipv4);
        NetworkDevice.addModule(module);
    }
}
