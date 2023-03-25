package DZ.dz5;

public interface CalcInterface<T> {

    T sum(T numperA, T numperB);
    T diff(T numperA, T numperB);
    T mult(T numperA, T numperB);
    T div(T numperA, T numperB);
}
