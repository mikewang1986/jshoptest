package net.jeeshop.services.manage.product;import java.util.List;import net.jeeshop.core.Services;import net.jeeshop.services.manage.product.bean.Product;public interface ProductService extends Services<Product> {	/**	 * 商品上架/下架	 * @param ids	商品ID集合	 * @param	status	状态	 */	void updateProductStatus(String[] ids,int status,String updateAccount);		/**	 * 根据商品ID查询商品库存集合	 * @param productIDs	 * @return	 */	List<Product> selectStockByIDs(List<String> productIDs);	int selectOutOfStockProductCount();	void updateImg(Product p);	/**	 * 更新商品表，绑定活动ID	 */	void updateProductBindActivityId(Product pro);	/**	 * 更新商品表，清除某个已绑定的商品的活动ID	 * @param activityID	 */	void updateResetThisProductActivityID(String activityID);}