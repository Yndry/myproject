package javaRush.exeptions;

public class ObertkaExeptions {
}
    /**
     * Щбертка checked-исключения внутрь RuntimeExeption
     */

    /**try
    {
        код, где может возникнуть checked-исключение
    }
catch(Exception exp)
    {
        throw new RuntimeException(exp);
    }

}
*/


    /**
     Распаковка Кштешьу-Exeption обратно в checked исключение
    try{
     try{
     код, где может возникнуть checked-исключение
     }
     catch(Exception exp)
     {throw new RuntimeException(exp);

     }
     catch(RuntimeException e)
     {
     Throwable cause = e.getCause();
     if (cause instanceof Exception)
     {
     Exception exp = (Exception) cause;
     // тут код по обработке Exception
     }
     }
     }
     */

//     try {
//             fileManager.copyFile("book.txt", "book_final_copy.txt");
//             fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
//             } catch (RuntimeException e) {
//             if (e.getCause() instanceof FileNotFoundException) {
//             System.out.println(FAILED_TO_READ);
//             } else if (e.getCause() instanceof FileSystemException) {
//             System.out.println(FAILED_TO_WRITE);
//             }
//             }
//             }
//             }
