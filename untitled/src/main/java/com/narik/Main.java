package com.narik;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();

        // Разбиваем текст на предложения
        String[] sentences = inputText.split("[.!?]");

        // Задача 1: Найти наибольшее количество предложений с одинаковыми словами
        Map<String, Integer> sentenceWordCountMap = new HashMap<>();
        String sentenceWithMaxOccurrences = null; // Переменная для отслеживания предложения с макс. количеством слов

        for (String sentence : sentences) {
            String[] words = sentence.trim().split("\\s+");
            Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
            String uniqueWordsKey = Arrays.toString(uniqueWords.toArray());
            int currentOccurrences = sentenceWordCountMap.getOrDefault(uniqueWordsKey, 0) + 1;
            sentenceWordCountMap.put(uniqueWordsKey, currentOccurrences);

            // Если текущее предложение имеет больше слов, чем предыдущее максимальное
            if (sentenceWithMaxOccurrences == null || currentOccurrences > sentenceWordCountMap.get(sentenceWithMaxOccurrences)) {
                sentenceWithMaxOccurrences = uniqueWordsKey;
            }
        }

        // Выводим предложение с максимальным количеством одинаковых слов
        System.out.println("Предложение с наибольшим количеством одинаковых слов:");
        System.out.println(getOriginalSentence(sentenceWithMaxOccurrences, sentences));
//Колобок – сказка, сказка сказка сказка сказка знакомая каждому взрослому, придется по душе и маленьким детям. Они быстро учат простые слова песенки Колобка и с удовольствием подпевают родителям. Из этой сказки малыши узнают, как испекла бабка для деда Колобка и положила на окошко остывать. Устал Колобок лежать, да решил спрыгнуть с окошка и укатиться со со двора за ворота. Встретил он по дороге Зайчика, Волка и Медведя, спел им свою песенку и убежал от них, не смогли его звери съесть. Катился дальше Колобок и повстречалась ему Лисичка. Попытался и ее Колобок обмануть, да не получилось у него, хитрее Лиса оказалась. Подманила поближе и скушала вкусный колобок.
        // Задача 2: Вывести предложения в порядке возрастания количества слов
        Arrays.sort(sentences, Comparator.comparingInt(sentence -> sentence.trim().split("\\s+").length));

        System.out.println("\nВсе предложения в порядке возрастания количества слов:");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }

    private static String getOriginalSentence(String uniqueWordsKey, String[] sentences) {
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(uniqueWordsKey);
        if (matcher.find()) {
            String[] uniqueWords = matcher.group(1).split(", ");
            for (String sentence : sentences) {
                String[] words = sentence.trim().split("\\s+");
                Set<String> sentenceUniqueWords = new HashSet<>(Arrays.asList(words));
                if (Arrays.asList(uniqueWords).equals(new ArrayList<>(sentenceUniqueWords))) {
                    return sentence;
                }
            }
        }
        return null;
    }
}