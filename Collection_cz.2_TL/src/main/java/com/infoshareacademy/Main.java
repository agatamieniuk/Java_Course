package com.infoshareacademy;

import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.vehicle.Car;
import com.infoshareacademy.model.vehicle.Engine;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ex15();
    }

    public static Integer[] ex1a(Integer... params) {
        Integer[] tab = new Integer[params.length];

        for (int i = 0; i < params.length; i++) {
            tab[i] = params[i] * 2;
        }
        return tab;
    }

    public static Car[] ex1b(Car... cars) {
        Car[] carTab = new Car[cars.length];

        for (int i = 0; i < cars.length; i++) {
            carTab[i] = cars[i];
        }
        return carTab;
    }

    public static List<Car> ex2(Car... cars) {
//        List<Car> carList = new ArrayList<>();

//        za pomocą petli forEach:
//        for(Car car: cars){
//            carList.add(car);
//        }

//        to samo za pomocą pętli for:
//        for (int i = 0; i < cars.length; i++) {
//            carList.add(cars[i]);
//        }
        return new ArrayList<>(Arrays.asList(cars)); //zapis jako jednolinijkowiec
    }

    public static Set<Engine> ex3(Engine... engines) {
//        Set<Engine> setEngine = new HashSet<>();
//
//        for(Engine eng: engines){
//            setEngine.add(eng);
//        }
        return new HashSet<>(Arrays.asList(engines)); //zapis jednolinijkowy
    }

    public static List<Integer> randomNumEx4() {
        Random random = new Random();
        List<Integer> randomNumList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            int randomNum = random.nextInt(1, 51);
            randomNumList.add(randomNum);
        }
        return randomNumList;
    }

    public static void ex4() {
        List<Integer> randomInt = randomNumEx4();
        System.out.println(randomInt);

        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(2, new ArrayList<>());
        map.put(5, new ArrayList<>());
        map.put(10, new ArrayList<>());

        for (Integer random : randomInt) {//petla po wszystkich kluczach (2, 5, 10)
            for (Integer key : map.keySet()) {//petla po wszystkich liczbach wylosowanych = randomach
                if (random % key == 0) { //jesli liczba dzieli sie bez reszty przez dany klucz:
                    List<Integer> wartoscPodDanymKluczem = map.get(key); //pobranie aktualnej wartości listy pod danym kluczem
                    wartoscPodDanymKluczem.add(random); //dodanie nowej liczby do listy
                    map.put(key, wartoscPodDanymKluczem); //nadpisanie wartości listy pod danym kluczem
                }
            }
        }
        System.out.println(map);
    }

    public static Map<String, Car> ex5a(Car... cars) {
        Map<String, Car> mapa = new HashMap<>();

        for (Car car : cars) {
            mapa.put(car.getName(), car);
        }
        return mapa;
    }

    public static Map<Integer, List<Car>> ex5b(Car... cars) {
        Map<Integer, List<Car>> mapa = new HashMap<>();

        for (Car car : cars) {
            Integer key = car.getEngine().getCapacity(); //wypełniamy klucz pojemnością silnika
            List<Car> value = new ArrayList<>();
            mapa.putIfAbsent(key, value); //wstawiamy arrayList aby nie miec nadpisywania wartosci w mapie (jesli nic nie ma w wartosci to wrzuca pustą arraykę)
            value = mapa.get(key); //pobranie listy dla danego klucza (albo juz cos tam bedzie, albo jesli wyniku z wczesniejszych operacji nie ma to jest pusta arrayka)
            value.add(car); //dodajemy do listy samochod

            mapa.putIfAbsent(key, value);
        }

        return mapa;
    }

    public static void ex6() {
        CarFactory car = new CarFactory();
        List<Car> carList = car.createRandomCars(3);
        System.out.println(carList);
        Iterator<Car> iterator = carList.iterator();
        while (iterator.hasNext()) {
            Car next = iterator.next();
            if (!iterator.hasNext()) {
                iterator.remove();
            }
        }
        System.out.println(carList);
    }

    public static List<Car> ex8a(List<Car> carList, Comparator<Car> comparator) {
        Collections.sort(carList, comparator);

        List<Car> cars = carList;
        return carList;
    }

    public static void ex10() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> letterMap = new HashMap<>();

        for (Character letters : input.toCharArray()) {
            String lettersInMap = letters.toString().trim();
            if (lettersInMap.isBlank()) {
                continue;
            }
            letterMap.putIfAbsent(lettersInMap, 0);
            int i = letterMap.get(lettersInMap) + 1;
            letterMap.put(lettersInMap, i);
        }
        System.out.println(letterMap);

        List<Map.Entry<String, Integer>> sorted = letterMap.entrySet().stream()
                .sorted((s1, s2) -> s2.getValue() - s1.getValue())
                .collect(Collectors.toList());
        System.out.println(sorted);
    }

    public static void ex14() {
        CarFactory car = new CarFactory();
        List<Car> randomCars = car.createRandomCars(10);
//        System.out.println(randomCars);

        List<String> byName = randomCars.stream()
                .map(s -> s.getName())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(byName);

        List<Integer> tempListToGetEnginePower = randomCars.stream()
                .map(s -> s.getEngine().getPower())
                .collect(Collectors.toList());
        System.out.println(tempListToGetEnginePower);

        int sum = randomCars.stream()
                .map(s -> s.getEngine().getPower())
                .mapToInt(s -> s.intValue()).sum();
        System.out.println(sum);
    }

    public static void ex15(){
        List<String> lista = new ArrayList<>();
        lista.add("andrzej");
        lista.add("bob");
        lista.add("");
        lista.add("basia");
        lista.add("czesia");
        lista.add("");
        lista.add("");

        List<Integer> collect = lista.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
