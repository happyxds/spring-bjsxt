package spring03.com.bjsxt.pojo;

/**
 * Created by Daniel(Dasi Xie) on 6/3/2020.
 */
public class Group {

    private int groupId;
    private String groupName;

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
