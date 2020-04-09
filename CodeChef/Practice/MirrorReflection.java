class Node
{
    long value;
    Node left, right;
    public Node(long item)
    {
        value = item;
        left = right = null;
    }
}
*/

boolean checkMirrorTree(Node node1, Node node2) {
    if(node1==null && node2==null)
    return true;
    if(node1==null || node2==null)
    return false;
    if(node1.value==node2.value)
    {
      if(checkMirrorTree(node1.left,node2.right)==true && checkMirrorTree(node1.right,node2.left)==true)
      return true;
    }
    return false;
    
}
