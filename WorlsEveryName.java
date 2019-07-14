import java.util.Scanner;

public class WorlsEveryName {
    public static int n = 9;

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            String name = in.nextLine();
            int len = name.length();
            //for (int i = 0; i < len; i++) {
            for (int rows = 0; rows < n; rows++) {
                for (int it = 0; it < len; it++) {
                    if (name.charAt(it) == 'a' || name.charAt(it) == 'A') {
                        A(rows);
                        //it++;
                    } else if (name.charAt(it) == 'b' || name.charAt(it) == 'B') {
                        B(rows);
                        //it++;
                    } else if (name.charAt(it) == 'c' || name.charAt(it) == 'C') {
                        C(rows);
                        //it++;
                    } else if (name.charAt(it) == 'd' || name.charAt(it) == 'D') {
                        D(rows);
                        //it++;
                    } else if (name.charAt(it) == 'e' || name.charAt(it) == 'E') {
                        E(rows);
                        //it++;
                    } else if (name.charAt(it) == 'f' || name.charAt(it) == 'F') {
                        F(rows);
                        //it++;
                    } else if (name.charAt(it) == 'g' || name.charAt(it) == 'G') {
                        G(rows);
                        //it++;
                    } else if (name.charAt(it) == 'h' || name.charAt(it) == 'H') {
                        H(rows);
                        //it++;
                    } else if (name.charAt(it) == 'i' || name.charAt(it) == 'I') {
                        I(rows);
                        ////it++;
                    } else if (name.charAt(it) == 'j' || name.charAt(it) == 'J') {
                        J(rows);
                        ////it++;
                    } else if (name.charAt(it) == 'k' || name.charAt(it) == 'K') {
                        K(rows);
                        //it++;
                    } else if (name.charAt(it) == 'l' || name.charAt(it) == 'L') {
                        L(rows);
                        //it++;
                    } else if (name.charAt(it) == 'm' || name.charAt(it) == 'M') {
                        M(rows);
                        //it++;
                    } else if (name.charAt(it) == 'n' || name.charAt(it) == 'N') {
                        N(rows);
                        //it++;
                    } else if (name.charAt(it) == 'o' || name.charAt(it) == 'O') {
                        O(rows);
                        //it++;
                    } else if (name.charAt(it) == 'p' || name.charAt(it) == 'P') {
                        P(rows);
                        //it++;
                    } else if (name.charAt(it) == 'q' || name.charAt(it) == 'Q') {
                        Q(rows);
                        //it++;
                    } else if (name.charAt(it) == 'r' || name.charAt(it) == 'R') {
                        R(rows);
                        //it++;
                    } else if (name.charAt(it) == 's' || name.charAt(it) == 'S') {
                        S(rows);
                        //it++;
                    } else if (name.charAt(it) == 't' || name.charAt(it) == 'T') {
                        T(rows);
                        //it++;
                    } else if (name.charAt(it) == 'u' || name.charAt(it) == 'U') {
                        U(rows);
                        //it++;
                    } else if (name.charAt(it) == 'v' || name.charAt(it) == 'V') {
                        V(rows);
                        //it++;
                    } else if (name.charAt(it) == 'w' || name.charAt(it) == 'W') {
                        W(rows);
                        //it++;
                    } else if (name.charAt(it) == 'x' || name.charAt(it) == 'X') {
                        X(rows);
                        // it++;
                    } else if (name.charAt(it) == 'y' || name.charAt(it) == 'Y') {
                        Y(rows);
                        //it++;
                    } else if (name.charAt(it) == 'z' || name.charAt(it) == 'Z') {
                        Z(rows);
                        //it++;
                    }
                }
                System.out.println();
            }
        }
    }

    public static void A(int rows) {
        for (int cols = 0; cols <= n / 2; cols++) {
            if (rows == 0 && cols != 0 && cols != n / 2
                    || rows == n / 2
                    || cols == 0 && rows != 0
                    || cols == n / 2 && rows != 0) {
                System.out.print("A ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.print(" ");
    }

    public static void B(int rows) {
        for (int cols = 0; cols <= n / 2; cols++) {
            if (rows == 0 && cols != n / 2
                    || rows == n / 2 && cols != n / 2
                    || rows == n - 1 && cols != n / 2
                    || cols == 0
                    || cols == n / 2 && rows != 0 && rows != n / 2 && rows != n - 1) {
                System.out.print("B ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void C(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (rows == 0 && cols != 0
                    || rows == n - 1 && cols != 0
                    || cols == 0 && rows != 0 && rows != n - 1) {
                System.out.print("C ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");

    }

    public static void D(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (rows == 0 && cols != n - 1 && cols != n - 2
                    || rows == n - 1 && cols != n - 1 && rows != n / 4 && cols != n - 2
                    || cols == 0
                    || cols == n - 1 && rows != 0 && rows != n - 1
            ) {
                System.out.print("D ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void E(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (rows == 0 || rows == n / 2 && cols <= n / 2 || rows == n - 1 || cols == 0) {
                System.out.print("E ");
            } else {
                System.out.print("  ");
            }

        }System.out.print(" ");
    }

    public static void F(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (rows == 0 || rows == n / 2 && cols <= n / 2 || cols == 0) {
                System.out.print("F ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void G(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (rows == 0 && cols != 0
                    || rows == n - 1 && cols != 0
                    || cols == 0 && rows != n - 1 && rows != 0
                    || cols == n - 1 && rows != 0 && rows >= n / 2
                    || rows == n / 2 && cols >= n / 2) {
                System.out.print("G ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void H(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (rows == n / 2 || cols == 0 || cols == n - 1) {
                System.out.print("H ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void I(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (rows == 0 || rows == n - 1 || cols == n / 2) {
                System.out.print("I ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void J(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (rows == 0 || cols == n / 2 && rows != n - 1
                    || rows == n - 1 && cols <= n / 2 && cols != n / 2) {
                System.out.print("J ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void K(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (cols == 0 || rows + cols == n / 2 || rows - cols == n / 2) {
                System.out.print("K ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void L(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (rows == n - 1 || cols == 0) {
                System.out.print("L ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void M(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (cols == 0
                    || cols == n - 1
                    || rows == cols && rows <= n / 2
                    || rows + cols == n - 1 && rows <= n / 2) {
                System.out.print("M ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void N(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (cols == 0 || cols == n - 1 || rows == cols) {
                System.out.print("N ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void O(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (cols == 0 && rows != n - 1 && rows != 0
                    || cols == n - 1 && rows != 0 && rows != n - 1
                    || rows == 0 && cols != 0 && cols != n - 1
                    || rows == n - 1 && cols != 0 && cols != n - 1) {
                System.out.print("O ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void P(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (cols == 0
                    || cols == n - 1 && rows < n / 2
                    || rows == n / 2
                    || rows == 0) {
                System.out.print("P ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void Q(int rows) {
        for (int cols = 0; cols <= n / 2; cols++) {
            if (cols == 0 && rows != 0 && rows != n / 2
                    || cols == n / 2 && rows != 0
                    || rows == n / 2 && cols != 0
                    || rows == 0 && cols != 0 && cols != n / 2
                    || rows + cols == n - 1
                    || rows == cols && rows >= n / 4) {
                System.out.print("Q ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void R(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (cols == 0
                    || cols == n - 1 && rows < n / 2 && rows != n / 2 && rows != 0
                    || rows == n / 2 && cols != n - 1
                    || rows == 0 && cols != n - 1
                    || rows == cols && rows >= n / 2) {
                System.out.print("R ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void S(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (cols == 0 && rows < n / 2 && rows != 0 && rows != n / 2
                    || cols == n - 1 && rows > n / 2 && rows != n / 2 && rows != n - 1
                    || rows == 0 && cols != 0
                    || rows == n / 2 && cols != n - 1 && cols != 0
                    || rows == n - 1 && cols != n - 1) {
                System.out.print("S ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void T(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (cols == n / 2 || rows == 0) {
                System.out.print("T ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void U(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (cols == 0 && rows != n - 1
                    || rows == n - 1 && cols != 0 && cols != n - 1
                    || cols == n - 1 && rows != n - 1) {
                System.out.print("U ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void V(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (rows < 5) {
                if (cols == rows || cols + rows == n - 1) {
                    System.out.print("V ");
                } else {
                    System.out.print(" ");
                }
            } else {
                System.out.print(" ");
            }
        }System.out.print(" ");
    }

    public static void W(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (cols == 0
                    || cols == n - 1
                    || cols == rows && cols >= n / 2
                    || cols + rows == n - 1 && cols < n / 2) {
                System.out.print("W ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void X(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (cols == rows || cols + rows == n - 1) {
                System.out.print("X ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void Y(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (cols == rows && rows < n / 2
                    || cols + rows == n - 1 && rows < n / 2
                    || cols == n / 2 && rows >= n / 2) {
                System.out.print("Y ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

    public static void Z(int rows) {
        for (int cols = 0; cols < n; cols++) {
            if (cols + rows == n - 1 || rows == 0 || rows == n - 1) {
                System.out.print("Z ");
            } else {
                System.out.print("  ");
            }
        }System.out.print(" ");
    }

}
