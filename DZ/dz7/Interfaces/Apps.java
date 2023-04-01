package DZ.dz7.Interfaces;

import java.util.HashSet;

public interface Apps<T> {

    public void instApp(String appName);
    public void delApp(String appName);
    public HashSet<String> getApps();
    public void sendMesApp(T t, String appName, String message);
    public void getMesApp(T t, String appName, String message);
}
