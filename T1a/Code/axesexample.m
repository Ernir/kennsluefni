fplot(@sin, [-3 3])
ax = gca;
ax.XTick = -3:0.5:3;
ax.XTickLabel{4} = 'langtmerki';
ax.XTickLabelRotation = 45;
title('Mynd þar sem ásunum hefur verið breytt')
ax.Title.Color = [1 0 0];