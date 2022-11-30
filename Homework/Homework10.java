        //Это вырвано из кода, если что, так что это надо вставить в общий код)

        //Частота встречаемости букв в словах
        char c0 = 'a';
        int count0 = 0;
        int countAll=0;
        while (c0 != 'z' + 1) {
            for (String s1 : vocab) {
                char[] arr = s1.toCharArray();
                Arrays.sort(arr);
                for (char c : arr) {
                    if (c == c0) count0++;
                }
            }
            if (count0%10 == 2 || count0%10 == 3 || count0%10 == 4 && count0%100 != 12 && count0%100 != 13 && count0%100 != 14) //Это для красоты
                System.out.printf("Буква %c встречается %d раза", c0, count0);
            else
                System.out.printf("Буква %c встречается %d раз", c0, count0);
            System.out.println();
            countAll += count0;
            c0++;
            count0 = 0;
        }
        System.out.printf("Всего символов - %d + «I»\n", countAll);
        System.out.println();

        //Количество слов, начинающихся на определенную букву (от 'a' до 'z')
        c0 = 'a';
        countAll = 0;
        while (c0 != 'z' + 1) {
            for (String s1 : vocab) {
                char[] arr = s1.toCharArray();
                    if (arr[0] == c0) count0++;
            }
            if (count0%10 == 2 || count0%10 == 3 || count0%10 == 4 && count0%100 != 12 && count0%100 != 13 && count0%100 != 14) //Это для красоты
                System.out.printf("%d слова на буква %c", count0, c0);
            else if (count0%10 == 1 && count0%100 != 11)
                System.out.printf("%d слово на буква %c", count0, c0);
            else
                System.out.printf("%d слов на буква %c", count0, c0);
            System.out.println();
            c0++;
            countAll += count0;
            count0 = 0;
        }
        System.out.printf("Всего первых символов - %d + «I», что итак очевидно, но это для проверки)", countAll);
