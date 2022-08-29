# Zadanie 7 - Streamy & Lambdy
#### Zakres: Java8: streamy, lambdy, data/czas

### Zadanie ToDoList cz.2 :scroll:

W zadaniu `Ex6` rozpoczęliśmy pisanie programu ToDoList.

Zadanie `Ex7` polega na rozszerzeniu naszej ToDoListy o nowe funkcjonalności. :mag:

Należy dodać do aplikacji (jeśli jeszcze nie posiada) klasę 'serwisową' (np. TaskService), w której znajdą się metody do bardziej zaawansowanego filtrowania i wyszukiwania naszych zadań.

Oto lista metod, wraz z opisem co dana metoda powinna zwracać:

1. Metoda, która wyszuka wszystkie zadania z najwyższym priorytetem i zwróci ich listę (najwyższy priorytet: 1, najniższy: 5)
2. Metoda, która wyszuka wszystkie zadania na następny dzień i zwróci ich listę.
3. Metoda, która posortuje zadania według malejącego priorytetu i zwróci posortowaną listę.
4. Metoda, która posortuje zadania według daty (najpierw najwcześniejsze) i zwróci posortowaną listę.
5. Metoda, która wyszuka wszystkie zadania dla danej kategorii (kategoria powinna być argumentem tej metody) i zwróci ich listę.
6. Metoda, która wyszuka wszystkie zadania zawierające w opisie podaną frazę (bez uwzględniania wielkości liter) i zwróci ich listę.
7. Metoda, która wyszuka zadanie najpilniejsze (z najwcześniejszą datą i z najwyższym priorytetem dla danego terminu) i zwróci jedno takie zadanie (najlepiej jako Optional<Task>).
8. Metoda, która podzieli zadania według kategorii i zwróci mapę (klucz: kategoria, wartość: lista zadań dla danej kategorii).
9. Metoda, która podzieli zadania według priorytetu i zwróci mapę (klucz: priorytet, wartość: lista zadań o danym priorytecie).
10. Metoda, która znajdzie zadanie z najwyższym priorytetem dla każdej kategorii i zwróci mapę (klucz: kategoria, wartość: Optional<Task>).


##### Wymagania:
- We wszystkich metodach należy wykorzystać streamy i lambdy.
- Każdy podpunkt zadania to osobna metoda w klasie 'TaskService'.
- Za każdą prawidłowo zaimplementowaną metodę: **0.5** pkt.
- Jak zawsze, należy pamiętać o zasadach `clean code`.

UWAGA :heavy_exclamation_mark: Nie trzeba dodawać ani zmieniać widoków i kontrolerów.


## Forma oddania zadania
Utwórz nowy branch o nazwie wg konwencji `7_imieNazwisko`, np. `7_BartoszSzablewski`.<br/>
:information_source: UWAGA :heavy_exclamation_mark: Nowy branch utworzyć wychodząc z brancha, na którym jest zadanie 
`Ex6`. Nie trzeba tworzyć nowego projektu pod to zadanie, jest to kontynuacja projektu z zadania `Ex6`.
Wykonaj zadanie na tym nowym branchu. <br/>
:information_source: UWAGA :heavy_exclamation_mark: Utwórz Pull Request **nie na branch master**, tylko na tzw. 
feature branch Ex6 :heavy_exclamation_mark:
Przykład Pull Requesta na GitHubie: `6_BartoszSzablewski` :arrow_left: `7_BartoszSzablewski`
W ten sposób w Pull Requeście powinna się znaleźć tylko nowo dodana/zmodyfikowana klasa 'TaskService', a nie kod całej aplikacji ToDoList.
Dopiero tak zgłoszone zadanie podlega ocenie.


## Punktacja

Do zdobycia jest :five:  pkt. Zadania oddane po terminie są oceniane na maksymalnie połowę punktów.

#### Powodzenia!

### :clock12: Termin oddania: Poniedziałek, 05.09.2022
