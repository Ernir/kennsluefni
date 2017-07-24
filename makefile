all:
	+$(MAKE) -C FOR3R
	+$(MAKE) -C T1a

cleanjunk:
	+$(MAKE) -C FOR3R cleanjunk
	+$(MAKE) -C T1a cleanjunk

clean:
	+$(MAKE) -C FOR3R clean
	+$(MAKE) -C T1a clean
