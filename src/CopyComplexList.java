
public class CopyComplexList {
	public RandomListNode Clone(RandomListNode pHead)
    {
		CloneNodes(pHead);
        ClonedRandom(pHead);
        return ReconnectNode(pHead);
    }
    public void CloneNodes(RandomListNode pHead) {
		RandomListNode pNode=pHead;
		while(pNode!=null) {
			RandomListNode pCloned=new RandomListNode(pNode.label);
			pCloned.next=pNode.next;
			pCloned.random=null;
			pNode.next=pCloned;
			pNode=pCloned.next;
		}
	}
	
	public void ClonedRandom(RandomListNode pHead) {
		RandomListNode pNode=pHead;
		while(pNode!=null){
			RandomListNode pCloned=pNode.next;
			if(pNode.random!=null) {
				pCloned.random=pNode.random.next;
			}
			pNode=pCloned.next;
		}
	}
	
	public RandomListNode ReconnectNode(RandomListNode pHead) {
		RandomListNode pNode=pHead;
		RandomListNode pClonedHead=null;
		RandomListNode pClonedNode=null;
		if(pNode!=null) {
			pClonedHead=pClonedNode=pNode.next;
			pNode.next=pClonedNode.next;
			pNode=pNode.next;
		}
		while(pNode!=null) {
			pClonedNode.next=pNode.next;
			pClonedNode=pClonedNode.next;
			pNode.next=pClonedNode.next;
			pNode=pNode.next;
		}
		return pClonedHead;
	}

}


