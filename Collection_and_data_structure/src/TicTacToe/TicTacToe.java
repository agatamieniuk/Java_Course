package TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToeMethod ticTacToeMethod = new TicTacToeMethod();

        ticTacToeMethod.moveX(2, 2);
    }
    /*Implementacja gry Kółko i Krzyżyk. Na początek przygotowanie kilku funkcjonalności:
    -wybrana implementacja przechowania planszy (3x3 pola z możliwymi wartościami: puste, X lub O)
    -metoda do wyświetlenia planszy
    -przypisanie danego znaku do konkretnego gracza (wybrana implementacja)
    -metoda do wstawiania znaku gracza na planszę (sprawdzamy czy ruch jest legalny, czy pole jest puste - zalecam również jako odrębna metoda)
    -metoda sprawdzająca czy któryś z graczy wygrał (czy utworzył linię trzech jednakowych znaków)
    Wszystko polecam ładnie opakowywać w klasy i metody. Przykładowo klasy: Board, Player itp. A wszystko dostępne z klasy opakowującej Game / TicTacToe.TicTacToe.
    Jeśli macie więcej czasu i pomysłów to jak najbardziej implementujcie kolejne metody, które uznacie za przydatne.*/
}
