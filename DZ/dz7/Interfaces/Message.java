package DZ.dz7.Interfaces;

public interface Message<T> {
    
    public void sendMes(T t, String message);
    public void getMes(T t, String message);
}
