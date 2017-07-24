all:
	+$(MAKE) -C FOR3R
	+$(MAKE) -C T1a
	+$(MAKE) -C Stærðfræðimynstur
	+$(MAKE) -C T2

cleanjunk:
	+$(MAKE) -C FOR3R cleanjunk
	+$(MAKE) -C T1a cleanjunk
	+$(MAKE) -C Stærðfræðimynstur cleanjunk
	+$(MAKE) -C T2 cleanjunk

clean:
	+$(MAKE) -C FOR3R clean
	+$(MAKE) -C T1a clean
	+$(MAKE) -C Stærðfræðimynstur clean
	+$(MAKE) -C T2 clean