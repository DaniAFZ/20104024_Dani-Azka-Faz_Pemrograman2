package com.Dani.PBO.ProjectAkhir.TicTacToe;

public class Pemenangnya {
    char[][] Area = PKotak.kotak;
    public boolean pemenang() {
        if (Area[0][0] != '_' && Area[0][0] == Area[0][1] && Area[0][0] == Area[0][2])
            return false;
        if (Area[1][0] != '_' && Area[1][0] == Area[1][1] && Area[1][0] == Area[1][2])
            return false;
        if (Area[2][0] != '_' && Area[2][0] == Area[2][1] && Area[2][0] == Area[2][2])
            return false;
        if (Area[0][0] != '_' && Area[0][0] == Area[1][0] && Area[0][0] == Area[2][0])
            return false;
        if (Area[0][1] != '_' && Area[0][1] == Area[1][1] && Area[0][1] == Area[2][1])
            return false;
        if (Area[0][2] != '_' && Area[0][2] == Area[1][2] && Area[0][2] == Area[2][2])
            return false;
        if (Area[0][0] != '_' && Area[0][0] == Area[1][1] && Area[0][0] == Area[2][2])
            return false;
        return Area[0][2] == '_' || Area[0][2] != Area[1][1] || Area[0][2] != Area[2][0];
    }
}
