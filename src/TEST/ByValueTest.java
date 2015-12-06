package TEST;


/**
 * @description Java��û�����ô���ֻ��ֵ����
 * �����Ƕ��󡢻������ͻ��Ƕ������顢�����������飬�ں����ж����ܸı���ʵ�ʵ�ַ���ܸı����е����ݡ�
 * @author hp
 * @date 2015-09-22
 * 
 */
class Person {

    private String name;

    private String sex;

    public Person(String x, String y) {
        this.name = x;
        this.sex = y;
    }

    // ��дtoString()�������������
    public String toString() {

        return name + " " + sex;
    }

    // ������������
    public static void swapObject(Person p1, Person p2) {
        Person tmp = p1;
        p1 = p2;
        p2 = tmp;
    }

    // ������������
    public static void swapInt(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    // ������������
    public static void swapObjectArray(Person[] p1, Person[] p2) {
        Person[] tmp = p1;
        p1 = p2;
        p2 = tmp;
    }

    // ����������������
    public static void swapIntArray(int[] x, int[] y) {
        int[] tmp = x;
        x = y;
        y = tmp;
    }

    // �ı���������е�����
    public static void changeObjectArray(Person[] p1, Person[] p2) {
        Person tmp = p1[1];
        p1[1] = p2[1];
        p2[1] = tmp;
        
        // �ٽ�p1[1]�޸�
        Person p = new Person("��ԭ", "Ů��");
        p1[1] = p;
    }

    // �ı�������������е�����
    public static void changeIntArray(int[] x, int[] y) {
        int tmp = x[1];
        x[1] = y[1];
        y[1] = tmp;

        x[1] = 5;
    }
}

public class ByValueTest {

    public static void main(String[] args) {

        // ������������������
        Person p1 = new Person("����", "Ů��");
        Person p2 = new Person("�ֻ�", "�е�");

        System.out.println("���󽻻�ǰ��p1 = " + p1.toString());
        System.out.println("���󽻻�ǰ��p2 = " + p2.toString());
        
        // ����p1�����p2����
        Person.swapObject(p1, p2);
        // �ӽ�������п�����ʵ�ʶ���δ����
        System.out.println("\n���󽻻���p1 = " + p1.toString());
        System.out.println("���󽻻���p2 = " + p2.toString());

        // ����������������
        Person[] arraya = new Person[2];
        Person[] arrayb = new Person[2];

        // �ֱ����������
        arraya[0] = new Person("����", "Ů��");
        arraya[1] = new Person("�ֻ�", "�е�");
        arrayb[0] = new Person("С��", "Ů��");
        arrayb[1] = new Person("��һ", "�е�");

        System.out.println('\n' + "�������齻��ǰ��arraya[0] = "
                + arraya[0].toString() + ", arraya[1] = "
                + arraya[1].toString());
        System.out.println("�������齻��ǰ��arrayb[0] = "
                + arrayb[0].toString() + ", arrayb[1] = "
                + arrayb[1].toString());
        
        // �����������������飬�������û�������Ľ�����
        Person.swapObjectArray(arraya, arrayb);
        System.out.println('\n' + "�������齻����arraya[0] = "
                + arraya[0].toString() + ", arraya[1] = "
                + arraya[1].toString());
        System.out.println("�������齻����arrayb[0] = "
                + arrayb[0].toString() + ", arrayb[1] = "
                + arrayb[1].toString());

        // ����������ͨ����
        int[] a = new int[2];
        int[] b = new int[2];

        // �������Ԫ�ظ�ֵ
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = i + 1;
        }

        System.out.println('\n' + "�����������齻��ǰ��a[0] = " + a[0] + ", a[1] = " + a[1]);
        System.out.println("�����������齻��ǰ��b[0] = " + b[0] + ", b[1] = " + b[1]);

        // �������������������飨�����������Ľ�����
        Person.swapIntArray(a, b);
        System.out.println('\n' + "�����������齻����a[0] = " + a[0] + ", a[1] = " + a[1]);
        System.out.println("�����������齻����b[0] = " + b[0] + ", b[1] = " + b[1]);
        
        // �ı�������������
        Person.changeObjectArray(arraya, arrayb);
        System.out.println('\n' + "�����������ݽ������ı��arraya[0] = " + arraya[0].toString());
        System.out.println("�����������ݽ������ı��arraya[1] = " + arraya[1].toString());
        System.out.println("�����������ݽ������ı��arrayb[0] = " + arrayb[0].toString());
        System.out.println("�����������ݽ������ı��arrayb[1] = " + arrayb[1].toString());
        
        // �ı�����������������
        Person.changeIntArray(a, b);
        System.out.println('\n' + "���������������ݽ������ı��a[1] = " + a[1]);
        System.out.println("���������������ݽ������ı��b[1] = " + b[1]);
    }
}