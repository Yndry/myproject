package zadachiUchoba.Chisla;

/**
 * Напишите программу на Java, чтобы найти число начальных чисел-кандидатов Лихреля и связанных чисел для n
 * в диапазоне 1..10000 включительно. (С этим пределом итерации 500).
 *
 * Число Лихрелы - это натуральное число, которое не может образовать палиндром в ходе итеративного процесса
 * многократного обращения его цифр и добавления результирующих чисел. Этот процесс иногда называют 196-алгоритмом,
 * после самого известного числа, связанного с процессом.
 * Первые несколько чисел Лихрела - это 196, 295, 394, 493, 592, 689, 691, 788, 790, 879, 887, ....
 */
import java.util.*;
import java.math.BigInteger;
public class Chisla5 {

        static Map<BigInteger, Tuple> cache = new HashMap<>();
        static class Tuple {
            final Boolean flag;
            final BigInteger bi;

            Tuple(boolean f, BigInteger b) {
                flag = f;
                bi = b;
            }
        }
        static BigInteger rev(BigInteger bi) {
            String s = new StringBuilder(bi.toString()).reverse().toString();
            return new BigInteger(s);
        }
        static Tuple lychrel(BigInteger n) {
            Tuple res;
            if ((res = cache.get(n)) != null)
                return res;

            BigInteger r = rev(n);
            res = new Tuple(true, n);
            List<BigInteger> seen = new ArrayList<>();
            for (int i = 0; i < 500; i++) {
                n = n.add(r);
                r = rev(n);

                if (n.equals(r)) {
                    res = new Tuple(false, BigInteger.ZERO);
                    break;
                }
                if (cache.containsKey(n)) {
                    res = cache.get(n);
                    break;
                }
                seen.add(n);
            }
            for (BigInteger bi : seen)
                cache.put(bi, res);
            return res;
        }
        public static void main(String[] args) {
            List<BigInteger> seeds = new ArrayList<>();
            List<BigInteger> related = new ArrayList<>();
            List<BigInteger> palin = new ArrayList<>();

            for (int i = 1; i <= 10_000; i++) {
                BigInteger n = BigInteger.valueOf(i);
                Tuple t = lychrel(n);
                if (!t.flag)
                    continue;
                if (n.equals(t.bi))
                    seeds.add(t.bi);
                else
                    related.add(t.bi);

                if (n.equals(t.bi))
                    palin.add(t.bi);
            }
            System.out.printf("%d Lychrel seeds: %s%n", seeds.size(), seeds);
            System.out.printf("%d Lychrel related%n", related.size());
            System.out.printf("%d Lychrel palindromes: %s%n", palin.size(), palin);
        }
    }



