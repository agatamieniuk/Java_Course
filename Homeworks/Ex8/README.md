# Zadanie 8 - Testy jednostkowe
#### Zakres: JUnit, AssertJ, Mockito, TDD

### Zadanie ToDoList cz.3 :scroll:

W zadaniu `Ex7` rozszerzyliśmy naszą ToDoListę o nowe funkcjonalności i dodaliśmy szereg metod do bardziej 
zaawansowanego filtrowania i wyszukiwania zadań. :mag:

Zadanie `Ex8` polega na napisaniu testów jednostkowych do wszystkich nowo dodanych metod z zadania `Ex7`.

Do każdej metody powinny być napisane min. 2 testy jednostkowe:
- sprawdzający tzw. 'happy path', czyli taki, w którym używamy poprawnej listy z zadaniami i jako wynik działania metody dostajemy oczekiwaną listę (np. posortowaną lub zawierającą tylko zadania dla danego kryterium wyszukiwania) lub mapę, lub obiekt zadania (w zależności od sygnatury metody),
- sprawdzający jakiś przypadek brzegowy ('edge case'), czyli taki, w którym np. lista z zadaniami jest pusta lub parametr wyszukiwania jest null/pusty itp.

Dla przypomnienia oto lista metod, do których należy napisać testy:

1. Metoda, która wyszuka wszystkie zadania z najwyższym priorytetem i zwróci ich listę (najwyższy priorytet: 1, najniższy: 5).
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
- W klasie testowej należy skorzystać z metod do sterowania testami (m.in. @BeforeEach, @AfterEach).
- Każdy test powinien mieć poprawną nazwę, która jednoznacznie mówi, co testujemy, lub mieć opis testu w adnotacji @DisplayName.
- Każdy test powinien mieć czytelną strukturę (sekcje Given/When/Then).
- Każdy test musi mieć przynajmniej jedną asercję (do wyboru: z pakietu JUnit lub AssertJ).
- Za każdą prawidłowo przetestowaną metodę (minimum dwa testy): **0.5** pkt.
- W przypadku testów również należy pamiętać o zasadach `clean code`.


## Forma oddania zadania
Utwórz nowy branch o nazwie wg konwencji `8_imieNazwisko`, np. `8_BartoszSzablewski`.<br/>  
:information_source: UWAGA :heavy_exclamation_mark: Nowy branch utworzyć wychodząc z brancha, na którym jest zadanie 
`Ex7` z metodami w klasie 'TaskService'. Nie trzeba tworzyć nowego projektu pod to zadanie, jest to kontynuacja 
projektu z zadań `Ex6` i `Ex7`.  
Wykonaj zadanie na tym nowym branchu. <br/>  
:information_source: UWAGA :heavy_exclamation_mark: Utwórz Pull Request **nie na branch master**, tylko na tzw. feature branch Ex8 :heavy_exclamation_mark:  
Przykład Pull Requesta na GitHubie: `7_BartoszSzablewski` :arrow_left: `8_BartoszSzablewski`  
W ten sposób w Pull Requeście powinna się znaleźć tylko nowo dodana klasa testowa 'TaskServiceTest', a nie kod całej aplikacji ToDoList.

Tylko tak zgłoszone zadanie podlega ocenie.

:heavy_exclamation_mark: UWAGA :heavy_exclamation_mark: UWAGA :heavy_exclamation_mark:  
Można również wykonać oba zadania (Ex7 i Ex8) razem na jednym branchu (np. `7_8_imieNazwisko`), stosując podejście 
TDD (Test Driven Development), w którym piszemy jednocześnie testy i funkcjonalność (najlepiej zaczynając od testu). Bardzo zachęcam do wypróbowania takiego podejścia.  
W tym wypadku należy utworzyć nowy branch, wychodząc z brancha, na którym jest zadanie `Ex6`, napisać rozwiązane na 
tym nowym branchu, a następnie utworzyć pull request na GitHubie według schematu: `6_BartoszSzablewski` :arrow_left: 
`7_8_BartoszSzablewski`.


---

## Punktacja

Do zdobycia jest :five:  pkt. Zadania oddane po terminie są oceniane na maksymalnie połowę punktów.

#### Powodzenia!

### :clock12: Termin oddania: Wtorek, 13.09.2022
