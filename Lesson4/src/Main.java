public class Main {
    public static void main(String[] args) {

        byte n1 = 127; //(1 byte = 8 bit) => (2^8 = 256) => [-128; 127]

        short n2 = 12345; //(2 byte = 16 bit) => (2^16 = 65,536) => [-32,768; 32,767]
        char a1 = 'a'; //(2 byte = 16 bit) => (2^16 = 65,536) => [-32,768; 32,767]

        int n3 = 12345678; //(4 byte = 32 bit) => (2^32 = 4,294,967,296) => [-2,147,483,648; 2,147,483,647]

        long n4 = 1234567890L; //(8 byte = 64 bit) => (2^64 = 18,446,744,073,709,551,616) => [9,223,372,036,854,775,808; 9,223,372,036,854,775,807]

        float n5 = 1.1234567899F; // 4 byte; [1.4 × 10⁻⁴⁵; 3.4 × 10³⁸]; precision(amount of number after point) 6-7 digits

        double n6 = 1.1234567890; // 8 byte; [4.9 × 10⁻³²⁴; 1.79 × 10³⁰⁸]; precision 15-16 digits

        //variable is the box that contains some data
    }
}
