package com.thzj.webcrawler.manager.impl;

import com.thzj.webcrawler.dao.TCrawlHisMapper;
import com.thzj.webcrawler.entity.CrawlHisSrcTypeEnum;
import com.thzj.webcrawler.entity.CrawlTypeEnum;
import com.thzj.webcrawler.entity.TCrawlHis;
import com.thzj.webcrawler.entity.TCrawlHisExample;
import com.thzj.webcrawler.manager.CrawlHisManager;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@Service
public class CrawlHisManagerImpl implements CrawlHisManager {
    private TCrawlHisMapper tCrawlHisMapper;

    @Override
    public int insert(TCrawlHis entity) {
        return tCrawlHisMapper.insert(entity);
    }


    @Override
    public Optional<TCrawlHis> queryInvestInstitutionByCrawlId(String crawlId) {
        TCrawlHisExample tCrawlHisExample = new TCrawlHisExample();
        tCrawlHisExample.createCriteria()
                .andCrawlIdEqualTo(crawlId)
                .andSrcTypeEqualTo(CrawlHisSrcTypeEnum.VC.getCode())
                .andCrawlTypeEqualTo(CrawlTypeEnum.INVEST_INSTITUTION.getCode());
        List<TCrawlHis> crawlHisList = tCrawlHisMapper.selectByExample(tCrawlHisExample);
        if (CollectionUtils.isEmpty(crawlHisList)) {
            return Optional.empty();
        }
        else {
            return Optional.of(crawlHisList.get(0));
        }
    }
}
