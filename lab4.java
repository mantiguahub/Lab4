//Name: Michael Antigua
//CMSC203

int w = 14;
int[] x = new int[8];
int[][] y = {{4, 8, 15}, {16, 23, 42, 10}, {8, 30}};
String[] z = new String[4];
for (int i = 0; i < z.length; i++) {
    z[i] = "element " + i;
}
Animal[] zoo = {tiger1, elephant2, giraffe3, monkey4, ape5};
Animal[] copy = zoo.clone();
Animal[] zoo = {tiger1, elephant2, giraffe3, monkey4, ape5};
Animal[] copy = new Animal[zoo.length];
for (int i = 0; i < zoo.length; i++) {
    copy[i] = new Animal(zoo[i]); 
}
String a = new String("hi");
String b = new String("hi");
a == b      
a.equals(b) 

