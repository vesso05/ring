// part of 2. Objects in Java



public class HeterogeneousTree {

    HNode root;


    /**
     * adds different type of Object to the Tree
     * @param usedObject
     */
    private void add(HNode usedObject)

    {
        while (true)
        {
            if (root == null)
            {
                root = usedObject;
                break;
            }
            if (root.value < usedObject.value)
            {
                root.right = new HNode(usedObject, usedObject.value );
                break;

            }

            if (root.value > usedObject.value)
            {
                root.left = new HNode(usedObject, usedObject.value );
                break;

            }
        }



    }



    public static void main(String[] args) {


        // System.out.print(root);
     //   String a = new String("hello");
      //  String b = new String("bye");
     //   Integer c = new Integer(7);

     //   HNode obj_a = new HNode(a,6);
     //   HNode obj_b = new HNode(b,3);
     //   HNode obj_c = new HNode(c,9);

   //     HeterogeneousTree main = new HeterogeneousTree();

    //    main.add(obj_a);
    //    main.add(obj_b);
     //   main.add(obj_c);

      //  System.out.print(main.root.reference);


    }

}
class HNode {
    int value;
    HNode left;
    HNode right;
    public Object reference;



    public HNode(Object obj, int input)  {
        this.reference = obj;
        this.value = input;
        right = null;
        left = null;
    }
}
