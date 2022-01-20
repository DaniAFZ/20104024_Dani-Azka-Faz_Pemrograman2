package com.Dani.PBO.ProjectAkhir.TicTacToe;

class pemain extends Area{ //interitance
    public char arah = 'X';
    public void pilihpemain() { //overload
        if (arah == 'X') {
            arah = 'O';
        } else {
            arah = 'X';
        }
    }
    public char arahnya() {
        return arah;
    }
}
