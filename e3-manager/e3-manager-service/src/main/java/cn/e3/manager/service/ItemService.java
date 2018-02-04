package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {

	/**
	 * 需求：根据商品id查询商品数据
	 * @param itemId
	 * @return
	 */
	public TbItem findItemById(Long itemId);
}
