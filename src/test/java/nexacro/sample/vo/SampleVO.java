package nexacro.sample.vo;

import java.util.Date;

import com.nexacro.spring.data.DataSetRowTypeAccessor;

/**
 * <pre>
 * Statements
 * </pre>
 * 
 * @ClassName : SampleVO.java
 * @Description : 클래스 설명을 기술합니다.
 * @author Park SeongMin
 * @since 2015. 8. 12.
 * @version 1.0
 * @see
 * @Modification Information
 * 
 *               <pre>
 *     since          author              description
 *  ===========    =============    ===========================
 *  2015. 8. 12.     Park SeongMin     최초 생성
 * </pre>
 */

public class SampleVO implements DataSetRowTypeAccessor {

    // Fields
    private String title;
    private String regId;
    private String postId;
    private String contents;
    private String communityId;
    private String hitCount;
    private Date regDate;

    private int rowType;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the regId
     */
    public String getRegId() {
        return regId;
    }

    /**
     * @param regId
     *            the regId to set
     */
    public void setRegId(String regId) {
        this.regId = regId;
    }

    /**
     * @return the postId
     */
    public String getPostId() {
        return postId;
    }

    /**
     * @param postId
     *            the postId to set
     */
    public void setPostId(String postId) {
        this.postId = postId;
    }

    /**
     * @return the contents
     */
    public String getContents() {
        return contents;
    }

    /**
     * @param contents
     *            the contents to set
     */
    public void setContents(String contents) {
        this.contents = contents;
    }

    /**
     * @return the communityId
     */
    public String getCommunityId() {
        return communityId;
    }

    /**
     * @param communityId
     *            the communityId to set
     */
    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    /**
     * @return the hitCount
     */
    public String getHitCount() {
        return hitCount;
    }

    /**
     * @param hitCount
     *            the hitCount to set
     */
    public void setHitCount(String hitCount) {
        this.hitCount = hitCount;
    }

    /**
     * @return the regDate
     */
    public Date getRegDate() {
        return regDate;
    }

    /**
     * @param regDate
     *            the regDate to set
     */
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

	@Override
	public int getRowType() {
		return this.rowType;
	}

	@Override
	public void setRowType(int rowType) {
		this.rowType = rowType;
	}

}