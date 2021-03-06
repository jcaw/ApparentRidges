﻿// Generated by HLC 4.1.3 (HL v4)
#define HLC_BOOT
#include <hlc.h>
#include <_std/StringTools.h>
vdynamic* String_charCodeAt(String,int);
extern hl_type t$_i32;
String String_substr(String,int,vdynamic*);

bool StringTools_isSpace(String r0,int r1) {
	bool r5;
	vdynamic *r2, *r6;
	int r3, r4;
	if( r0 == NULL ) hl_null_access();
	r2 = String_charCodeAt(r0,r1);
	r3 = r2 ? r2->v.i : 0;
	r4 = 8;
	if( r4 >= r3 ) goto label$de37252_1_8;
	r3 = r2 ? r2->v.i : 0;
	r4 = 14;
	if( r3 < r4 ) goto label$de37252_1_15;
	label$de37252_1_8:
	r3 = 32;
	r6 = hl_alloc_dynamic(&t$_i32);
	r6->v.i = r3;
	if( r2 == r6 || (r2 && r6 && (r2->v.i == r6->v.i)) ) goto label$de37252_1_13;
	r5 = false;
	goto label$de37252_1_14;
	label$de37252_1_13:
	r5 = true;
	label$de37252_1_14:
	return r5;
	label$de37252_1_15:
	r5 = true;
	return r5;
}

String StringTools_ltrim(String r0) {
	String r2;
	bool r5;
	vdynamic *r6;
	int r1, r3, r4;
	if( r0 == NULL ) hl_null_access();
	r1 = r0->length;
	r3 = 0;
	label$de37252_2_3:
	if( r3 >= r1 ) goto label$de37252_2_9;
	r5 = StringTools_isSpace(r0,r3);
	if( !r5 ) goto label$de37252_2_9;
	++r3;
	goto label$de37252_2_3;
	label$de37252_2_9:
	r4 = 0;
	if( r4 >= r3 ) goto label$de37252_2_16;
	if( r0 == NULL ) hl_null_access();
	r4 = r1 - r3;
	r6 = hl_alloc_dynamic(&t$_i32);
	r6->v.i = r4;
	r2 = String_substr(r0,r3,r6);
	return r2;
	label$de37252_2_16:
	return r0;
}

String StringTools_rtrim(String r0) {
	String r2;
	bool r6;
	vdynamic *r7;
	int r1, r3, r4, r5;
	if( r0 == NULL ) hl_null_access();
	r1 = r0->length;
	r3 = 0;
	label$de37252_3_3:
	if( r3 >= r1 ) goto label$de37252_3_12;
	r4 = r1 - r3;
	r5 = 1;
	r4 = r4 - r5;
	r6 = StringTools_isSpace(r0,r4);
	if( !r6 ) goto label$de37252_3_12;
	++r3;
	goto label$de37252_3_3;
	label$de37252_3_12:
	r5 = 0;
	if( r5 >= r3 ) goto label$de37252_3_20;
	if( r0 == NULL ) hl_null_access();
	r4 = 0;
	r5 = r1 - r3;
	r7 = hl_alloc_dynamic(&t$_i32);
	r7->v.i = r5;
	r2 = String_substr(r0,r4,r7);
	return r2;
	label$de37252_3_20:
	return r0;
}

String StringTools_trim(String r0) {
	String r1;
	r1 = StringTools_rtrim(r0);
	r1 = StringTools_ltrim(r1);
	return r1;
}

