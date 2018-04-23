/** 
* Устанавливаем принадлежность класса к пакету ProjectTest 
*/ 
package com.sanifrey.test1;
/** 
* Импортируем библиотеку 
*/ 
import static org.junit.Assert.*;
/** 
* Импортируем библиотеку 
*/ 
import org.junit.Test;
/** 
* Основной класс 
*/ 
public class Formula8Test {
/** 
* Объявляем переменную типа Formula 
*/ 
private Formula formula;
/** 
* Обозначаем , что следующий метод будет тестируемым 
*/ 
@Test
/** 
* тестируемый метод 
*/ 
public void test() {
/** 
* Инициализируем переменную formula 
*/ 
 formula = new Formula(null);
 /** 
 * Тестируем метод с входными параметрами 119.5, 8.5, 8 и с предполагаемым результатом 51.5 для проверки работы программы с дробными числами.
 * Тестируемый метод выполняет расчёт свободной площади в комнате по формуле: Z=S-a*b.
 * Z - Значение свободной площади в комнате;
 * S - Значение всей площади в комнате, передается первым при вызове метода;
 * a - Значение ширины объекта, передается вторым при вызове метода;
 * b - Значение длины объекта, передается третьим при вызове метода;
 * Предполагается, что программа выполнит следующие расчёты: 119.5-8.5*8 и
 * вернёт значение: 51.5.
 */  formula.PublicAddObject( "8.5", "8");
assertEquals("51.5",formula.PFormula("119.5"));
formula.PublicDeleteObjects();
}
}