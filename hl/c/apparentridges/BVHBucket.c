﻿// Generated by HLC 4.1.3 (HL v4)
#define HLC_BOOT
#include <hlc.h>
#include <apparentridges/BVHBucket.h>
extern hl_type t$apparentridges_BBox;
void apparentridges_BBox_new(apparentridges__BBox);

void apparentridges_BVHBucket_new(apparentridges__BVHBucket r0) {
	apparentridges__BBox r1;
	double r3;
	int r4;
	r1 = (apparentridges__BBox)hl_alloc_obj(&t$apparentridges_BBox);
	apparentridges_BBox_new(r1);
	r0->bbox = r1;
	r3 = 0.;
	r0->area = r3;
	r4 = 0;
	r0->count = r4;
	return;
}

