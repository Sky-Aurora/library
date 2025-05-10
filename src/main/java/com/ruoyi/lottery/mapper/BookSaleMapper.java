package com.ruoyi.lottery.mapper;

import java.util.List;
import com.ruoyi.lottery.domain.BookSale;

/**
 * 借阅记录Mapper接口
 *
 */
public interface BookSaleMapper 
{
    /**
     * 查询借阅记录
     * 
     * @param id 借阅记录主键
     * @return 借阅记录
     */
    public BookSale selectBookSaleById(Long id);

    /**
     * 查询借阅记录列表
     * 
     * @param bookSale 借阅记录
     * @return 借阅记录集合
     */
    public List<BookSale> selectBookSaleList(BookSale bookSale);

    /**
     * 新增借阅记录
     * 
     * @param bookSale 借阅记录
     * @return 结果
     */
    public int insertBookSale(BookSale bookSale);

    /**
     * 修改借阅记录
     * 
     * @param bookSale 借阅记录
     * @return 结果
     */
    public int updateBookSale(BookSale bookSale);

    /**
     * 删除借阅记录
     * 
     * @param id 借阅记录主键
     * @return 结果
     */
    public int deleteBookSaleById(Long id);

    /**
     * 批量删除借阅记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBookSaleByIds(String[] ids);
}
