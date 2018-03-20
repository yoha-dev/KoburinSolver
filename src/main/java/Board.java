public class Board {

    public Cell[][] board;

    public void initialiseBoard() {
        this.board = new Cell[10][10];
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (y == 0 && x == 0
                        || y == 6 && x == 0
                        || y == 8 && x == 1
                        || y == 3 && x == 3
                        || y == 3 && x == 6
                        || y == 4 && x == 5
                        || y == 8 && x == 5)
                    board[x][y] = new Cell(x, y, '0');
                else if (y == 3 && x == 0
                        || y == 1 && x == 5
                        || y == 4 && x == 9
                        || y == 8 && x == 7)
                    board[x][y] = new Cell(x, y, '1');
                else if (y == 2 && x == 7
                        || y == 6 && x == 7
                        || y == 8 && x == 3)
                    board[x][y] = new Cell(x, y, '2');
                else
                    board[x][y] = new Cell(x, y, '_');
            }
        }
    }


    public void initialiseSmallBoard() {
        this.board = new Cell[4][4];
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                if (y == 3 && x == 3)
                    board[x][y] = new Cell(x, y, '0');
                else if (y == 1 && x == 1)
                    board[x][y] = new Cell(x, y, '2');
                else
                    board[x][y] = new Cell(x, y, '_');
            }
        }
    }


    public void blackenSmallBoard() {
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                if (y == 1 && x == 2 ||
                        y == 2 && x == 1)
                    board[x][y] = new Cell(x, y, 'x');
            }
        }
    }


    public Cell[][] getBoard(){
        return board;
    }


    public void printBoard() {
        System.out.println("x-länge: " + (this.board[0].length));
        System.out.println("y-länge: " + (this.board.length));
        for (int x = 0; x < this.board[0].length; x++) {
            for (int y = 0; y < this.board.length; y++) {
                System.out.print(board[x][y].getValue() + " | ");
                if (y == this.board.length - 1) System.out.print("\n--------------------------------------- \n");
            }
        }
    }

    public void printBoardWithFollowers() {
        System.out.println("x-länge: " + (this.board[0].length));
        System.out.println("y-länge: " + (this.board.length));
        for (int x = 0; x < this.board[0].length; x++) {
            for (int y = 0; y < this.board.length; y++) {
                if (board[x][y].getNext() != null)
                    System.out.print(board[x][y].getNext().x + "-" + board[x][y].getNext().y + " | ");
                else System.out.print("    | ");
                if (y == this.board.length - 1) System.out.print("\n--------------------------------------- \n");
            }
        }
    }


}