package com.ruoyi.lottery.mapper;

import java.util.List;
import com.ruoyi.lottery.domain.BookOrders;

/**
 * 借阅记录Mapper接口
 * 
 * @author Shawn
 * @date 2024-02-29
 */
public interface BookOrdersMapper 
{
    /**
     * 查询借阅记录
     * 
     * @param id 借阅记录主键
     * @return 借阅记录
     */
    public BookOrders selectBookOrdersById(Long id);

    /**
     * 查询借阅记录列表
     * 
     * @param bookOrders 借阅记录
     * @return 借阅记录集合
     */
    public List<BookOrders> selectBookOrdersList(BookOrders bookOrders);

    /**
     * 新增借阅记录
     * 
     * @param bookOrders 借阅记录
     * @return 结果
     */
    public int insertBookOrders(BookOrders bookOrders);

    /**
     * 修改借阅记录
     * 
     * @param bookOrders 借阅记录
     * @return 结果
     */
    public int updateBookOrders(BookOrders bookOrders);

    /**
     * 删除借阅记录
     * 
     * @param id 借阅记录主键
     * @return 结果
     */
    public int deleteBookOrdersById(Long id);

    /**
     * 批量删除借阅记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBookOrdersByIds(String[] ids);
}
