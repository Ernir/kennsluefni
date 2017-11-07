x = -2*pi:0.1:2*pi;
y = sin(x);
subplot(2,1,1);
plot(x,y);
xlabel('x');
ylabel('sin(x)');
axis([-2*pi 2*pi -1 1]);

y = cos(x);
subplot(2,1,2);
plot(x,y);
xlabel('x');
ylabel('cos(x)');
axis([-2*pi 2*pi -1 1]);