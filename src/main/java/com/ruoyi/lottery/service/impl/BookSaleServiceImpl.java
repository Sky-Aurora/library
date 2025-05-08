package com.ruoyi.lottery.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lottery.mapper.BookSaleMapper;
import com.ruoyi.lottery.domain.BookSale;
import com.ruoyi.lottery.service.IBookSaleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 借阅记录Service业务层处理
 * 
 * @author Shawn
 * @date 2024-03-05
 */
@Service
public class BookSaleServiceImpl implements IBookSaleService 
{
    @Autowired
    private BookSaleMapper bookSaleMapper;

    /**
     * 查询借阅记录
     * 
     * @param id 借阅记录主键
     * @return 借阅记录
     */
    @Override
    public BookSale selectBookSaleById(Long id)
    {
        return bookSaleMapper.selectBookSaleById(id);
    }

    /**
     * 查询借阅记录列表
     * 
     * @param bookSale 借阅记录
     * @return 借阅记录
     */
    @Override
    public List<BookSale> selectBookSaleList(BookSale bookSale)
    {
        return bookSaleMapper.selectBookSaleList(bookSale);
    }

    /**
     * 新增借阅记录
     * 
     * @param bookSale 借阅记录
     * @return 结果
     */
    @Override
    public int insertBookSale(BookSale bookSale)
    {
        bookSale.setCreateTime(DateUtils.getNowDate());
        return bookSaleMapper.insertBookSale(bookSale);
    }

    /**
     * 修改借阅记录
     * 
     * @param bookSale 借阅记录
     * @return 结果
     */
    @Override
    public int updateBookSale(BookSale bookSale)
    {
        return bookSaleMapper.updateBookSale(bookSale);
    }

    /**
     * 批量删除借阅记录
     * 
     * @param ids 需要删除的借阅记录主键
     * @return 结果
     */
    @Override
    public int deleteBookSaleByIds(String ids)
    {
        return bookSaleMapper.deleteBookSaleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除借阅记录信息
     * 
     * @param id 借阅记录主键
     * @return 结果
     */
    @Override
    public int deleteBookSaleById(Long id)
    {
        return bookSaleMapper.deleteBookSaleById(id);
    }
}
