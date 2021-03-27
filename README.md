# Junit-Udemy

@Before -> El bloque de codigo dentro de la funcion con la anotacion before se ejecuta eso antes de ejecutarse cada test

@After --> El bloque de codigo dentro de la funcion con la anotacion after se ejecuta despues de cada test.

@BeforeClass --> El bloque de codigo dentro de la funcion con la anotacion beforeClass se ejecuta solo una vez, antes de ejecutar todos los test

@AfterClass --> El bloque de codigo dentro de la funcion con la anotacion afterClass se ejecuta solo una vez, despues de ejecutar todos los test

assertArrayEquals --> Compara los valores dentro de un array.

@Test(expected = Exception.class) --> testing exceptions

@Test(timeout = miliseconds) --> Testing performance

---------------
For Parameterized test

1 - @RunWith(Parameterized.class)
2 - define a method with parameters
3 - in the test method use the input and expected output parameters 

---------------
Suite

Sirve para agrupar ciertos tests.