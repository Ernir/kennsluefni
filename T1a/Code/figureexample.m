figure(1)
fplot(@sin, [-3 3])
figure(2)
fplot(@cos, [-3 3])
figure(1)
hold on
fplot(@tan, [-3 3])
figure(2)
hold on
fplot(@(x) x.^2, [-3 3])