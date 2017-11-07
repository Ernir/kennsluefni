eink = round(randn(1,80)*2.5+5);
eink = eink(0 <= eink & eink <= 10);
histogram(eink,'BinMethod','integer')
ax = gca;
ax.XLim = [-1 11];
ax.YLim = [0 20];
ax.XTick = 0:10;