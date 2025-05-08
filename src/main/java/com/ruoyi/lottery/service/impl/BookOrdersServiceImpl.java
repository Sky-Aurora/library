package com.ruoyi.lottery.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lottery.mapper.BookOrdersMapper;
import com.ruoyi.lottery.domain.BookOrders;
import com.ruoyi.lottery.service.IBookOrdersService;
import com.ruoyi.common.core.text.Convert;

/**
 * 借阅记录Service业务层处理
 * 
 * @author Shawn
 * @date 2024-02-29
 */
@Service
public class BookOrdersServiceImpl implements IBookOrdersService 
{
    @Autowired
    private BookOrdersMapper bookOrdersMapper;

    /**
     * 查询借阅记录
     * 
     * @param id 借阅记录主键
     * @return 借阅记录
     */
    @Override
    public BookOrders selectBookOrdersById(Long id)
    {
        return bookOrdersMapper.selectBookOrdersById(id);
    }

    /**
     * 查询借阅记录列表
     * 
     * @param bookOrders 借阅记录
     * @return 借阅记录
     */
    @Override
    public List<BookOrders> selectBookOrdersList(BookOrders bookOrders)
    {
        return bookOrdersMapper.selectBookOrdersList(bookOrders);
    }

    /**
     * 新增借阅记录
     * 
     * @param bookOrders 借阅记录
     * @return 结果
     */
    @Override
    public int insertBookOrders(BookOrders bookOrders)
    {
        return bookOrdersMapper.insertBookOrders(bookOrders);
    }

    /**
     * 修改借阅记录
     * 
     * @param bookOrders 借阅记录
     * @return 结果
     */
    @Override
    public int updateBookOrders(BookOrders bookOrders)
    {
        return bookOrdersMapper.updateBookOrders(bookOrders);
    }

    /**
     * 批量删除借阅记录
     * 
     * @param ids 需要删除的借阅记录主键
     * @return 结果
     */
    @Override
    public int deleteBookOrdersByIds(String ids)
    {
        return bookOrdersMapper.deleteBookOrdersByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除借阅记录信息
     * 
     * @param id 借阅记录主键
     * @return 结果
     */
    @Override
    public int deleteBookOrdersById(Long id)
    {
        return bookOrdersMapper.deleteBookOrdersById(id);
    }
}
