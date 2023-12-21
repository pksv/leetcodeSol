package org.example;

public class AddBinary {
    public static void main(String[] args) {
//        String a = "11", b = "1";
//        String a = "1010", b = "1011";
//        String a = "0", b = "0";
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(new AddBinary().addBinary(a, b));
    }

    private String addBinary(String a, String b) {
        if (a.equals("0") && b.equals("0")) return "0";
        char carry = '0';
        StringBuilder res = new StringBuilder();
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            var y = i < 0 ? '0' : a.charAt(i);
            var z = j < 0 ? '0' : b.charAt(j);
            var x = getAdd(y, z, carry);
            if (x.length() == 2) {
                carry = x.charAt(0);
                res.append(x.charAt(1));
            } else {
                carry = '0';
                res.append(x);
            }
        }
        if (carry == '1') res.append('1');
        return res.reverse().toString();
    }

    private String getAdd(char a, char b, char carry) {
        boolean condt = (a == '0' && b == '1') || (a == '1' && b == '0');
        if (carry == '0') {
            if (a == '0' && b == '0') {
                return "0";
            }
            if (a == '1' && b == '1') {
                return "10";
            }
            if (condt) {
                return "1";
            }
        } else {
            if (a == '0' && b == '0') {
                return "1";
            }
            if (a == '1' && b == '1') {
                return "11";
            }
            if (condt) {
                return "10";
            }
        }
        return "0";
    }



    /*public String addBinary(String a, String b) {
        if (a.equals("0") && b.equals("0")) return "0";
        int aVal = Integer.parseInt(a, 2);
        int bVal = Integer.parseInt(b, 2);
        int cVal = aVal + bVal;
        StringBuilder res = new StringBuilder();
        while (cVal > 0) {
            res.append(cVal % 2);
            cVal /= 2;
        }
        return res.reverse().toString();
    }*/
}
