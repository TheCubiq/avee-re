.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;
.super Ljava/lang/Object;
.source "_SegmentPathLetter.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;
    }
.end annotation


# static fields
.field static svgPathData48to90:[Ljava/lang/String; = null

.field public static final typeName:Ljava/lang/String; = "Letter"


# instance fields
.field angleAculumator:F

.field charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;

.field charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

.field counter:F

.field currentCharIndex:I

.field measureMul:F

.field private measureText:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

.field pathBounds:Landroid/graphics/RectF;

.field radius:F

.field rotationMeasure:Ljava/lang/String;

.field sideInAngle:F

.field totalPathLength:F

.field vec:Lcom/daaw/avee/Common/Vec2f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x2b

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "m 161.18387,107.46093 q 0,7.83203 -2.46094,11.50391 -2.44141,3.65234 -7.59766,3.65234 -5.23437,0 -7.65625,-3.71094 -2.40234,-3.71094 -2.40234,-11.40625 0,-7.753904 2.44141,-11.44531 2.4414,-3.710938 7.61718,-3.710938 5.23438,0 7.63672,3.769532 2.42188,3.75 2.42188,11.347656 z m -5.13672,8.86719 q 0.68359,-1.58203 0.91797,-3.71094 0.2539,-2.14844 0.2539,-5.15625 0,-2.96875 -0.2539,-5.15625 -0.23438,-2.1875 -0.9375,-3.710938 -0.6836,-1.503906 -1.875,-2.265625 -1.17188,-0.761718 -3.02735,-0.761718 -1.83593,0 -3.04687,0.761718 -1.19141,0.761719 -1.89453,2.304688 -0.66406,1.445315 -0.91797,3.769535 -0.23438,2.32421 -0.23438,5.09765 0,3.04688 0.21485,5.09766 0.21484,2.05078 0.91797,3.67187 0.64453,1.52344 1.8164,2.32422 1.19141,0.80078 3.14453,0.80078 1.83594,0 3.04688,-0.76172 1.21094,-0.76171 1.875,-2.30468 z"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "m 185.03152,122.01171 -15.74218,0 0,-2.96875 6.05468,0 0,-19.492186 -6.05468,0 0,-2.65625 q 1.23047,0 2.63672,-0.195313 1.40625,-0.214844 2.1289,-0.605469 0.89844,-0.488281 1.40625,-1.230468 0.52735,-0.761719 0.60547,-2.03125 l 3.02734,0 0,26.210936 5.9375,0 0,2.96875 z"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "m 212.16043,122.01171 -19.6875,0 0,-4.08203 q 2.05078,-1.75781 4.10156,-3.51563 2.07032,-1.75781 3.84766,-3.49609 3.75,-3.63281 5.13672,-5.76172 1.38672,-2.14844 1.38672,-4.6289 0,-2.265629 -1.50391,-3.53516 -1.48437,-1.289063 -4.16016,-1.289063 -1.77734,0 -3.84765,0.625 -2.07031,0.625 -4.04297,1.914063 l -0.19531,0 0,-4.101563 q 1.38672,-0.683593 3.6914,-1.25 2.32422,-0.566406 4.49219,-0.566406 4.47266,0 7.01172,2.167969 2.53906,2.148437 2.53906,5.83984 0,1.66016 -0.42969,3.10547 -0.41015,1.42578 -1.23046,2.71485 -0.76172,1.21093 -1.79688,2.38281 -1.01562,1.17187 -2.48047,2.59765 -2.08984,2.05079 -4.3164,3.98438 -2.22657,1.91406 -4.16016,3.55469 l 15.64453,0 0,3.33984 z"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "m 235.07059,108.0078 q 0.9375,0.83985 1.54297,2.10938 0.60546,1.26953 0.60546,3.28125 0,1.99219 -0.72265,3.65234 -0.72266,1.66016 -2.03125,2.89063 -1.46485,1.36719 -3.45703,2.03125 -1.97266,0.64453 -4.33594,0.64453 -2.42188,0 -4.76563,-0.58594 -2.34375,-0.5664 -3.84765,-1.25 l 0,-4.08203 0.29297,0 q 1.66015,1.09375 3.90625,1.81641 2.24609,0.72265 4.33593,0.72265 1.23047,0 2.61719,-0.41015 1.38672,-0.41016 2.2461,-1.21094 0.89843,-0.85938 1.32812,-1.89453 0.44922,-1.03516 0.44922,-2.61719 0,-1.5625 -0.50781,-2.57812 -0.48828,-1.03516 -1.36719,-1.6211 -0.87891,-0.60547 -2.12891,-0.82031 -1.25,-0.23438 -2.69531,-0.23438 l -1.75781,0 0,-3.24218 1.36719,0 q 2.96875,0 4.72656,-1.23047 1.77734,-1.25 1.77734,-3.632814 0,-1.054687 -0.44922,-1.835937 -0.44922,-0.800782 -1.25,-1.308594 -0.83984,-0.507813 -1.79687,-0.703125 -0.95703,-0.195313 -2.16797,-0.195313 -1.85547,0 -3.94531,0.664063 -2.08985,0.664062 -3.94532,1.875 l -0.19531,0 0,-4.082031 q 1.38672,-0.683594 3.69141,-1.25 2.32422,-0.585938 4.49219,-0.585938 2.1289,0 3.75,0.390625 1.62109,0.390625 2.92968,1.25 1.40625,0.9375 2.12891,2.265625 0.72266,1.328125 0.72266,3.105469 0,2.42187 -1.71875,4.23828 -1.69922,1.79688 -4.02344,2.26563 l 0,0.27343 q 0.9375,0.15625 2.14844,0.66407 1.21093,0.48828 2.05078,1.23046 z"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "m 263.76199,113.82812 -4.3164,0 0,8.18359 -3.75,0 0,-8.18359 -13.92578,0 0,-4.49219 14.08203,-16.40625 3.59375,0 0,17.77344 4.3164,0 0,3.125 z m -8.0664,-3.125 0,-13.125003 -11.26953,13.125003 11.26953,0 z"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "m 288.33231,112.77343 q 0,2.03125 -0.74219,3.88672 -0.74219,1.85547 -2.03125,3.125 -1.40625,1.36719 -3.35938,2.10937 -1.93359,0.72266 -4.49218,0.72266 -2.38282,0 -4.58985,-0.50781 -2.20703,-0.48828 -3.73047,-1.19141 l 0,-4.12109 0.27344,0 q 1.60156,1.01562 3.75,1.73828 2.14844,0.70312 4.21875,0.70312 1.38672,0 2.67578,-0.39062 1.3086,-0.39063 2.32422,-1.36719 0.85938,-0.83984 1.28906,-2.01172 0.44922,-1.17187 0.44922,-2.71484 0,-1.50391 -0.52734,-2.53906 -0.50781,-1.03516 -1.42578,-1.66016 -1.01563,-0.74219 -2.48047,-1.03516 -1.44531,-0.3125 -3.24219,-0.3125 -1.71875,0 -3.32031,0.23438 -1.58203,0.23437 -2.73438,0.46875 l 0,-14.98047 17.5,0 0,3.417969 -13.73047,0 0,7.734371 q 0.83985,-0.0781 1.71875,-0.11718 0.87891,-0.0391 1.52344,-0.0391 2.36328,0 4.14063,0.41016 1.77734,0.39062 3.26172,1.40625 1.5625,1.07422 2.42187,2.77344 0.85938,1.69922 0.85938,4.25781 z"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "m 314.46512,112.57812 q 0,4.43359 -2.92969,7.24609 -2.91016,2.79297 -7.14844,2.79297 -2.14843,0 -3.90625,-0.66406 -1.75781,-0.66407 -3.10547,-1.97266 -1.67968,-1.62109 -2.59765,-4.29687 -0.89844,-2.67579 -0.89844,-6.44532 0,-3.86718 0.82031,-6.85547 0.83985,-2.988276 2.65625,-5.312495 1.71875,-2.207031 4.4336,-3.4375 2.71484,-1.25 6.32812,-1.25 1.15235,0 1.9336,0.09766 0.78125,0.09766 1.58203,0.351563 l 0,3.730468 -0.19532,0 q -0.54687,-0.292968 -1.66015,-0.546875 -1.09375,-0.273437 -2.2461,-0.273437 -4.19921,0 -6.69921,2.636719 -2.5,2.617187 -2.91016,7.089837 1.64062,-0.99609 3.22266,-1.5039 1.60156,-0.52735 3.6914,-0.52735 1.85547,0 3.26172,0.35156 1.42578,0.33204 2.91016,1.36719 1.71875,1.19141 2.57812,3.00781 0.87891,1.81641 0.87891,4.41407 z m -3.96485,0.15625 q 0,-1.81641 -0.54687,-3.00782 -0.52734,-1.1914 -1.75781,-2.07031 -0.89844,-0.625 -1.99219,-0.82031 -1.09375,-0.19531 -2.28516,-0.19531 -1.66015,0 -3.08593,0.39062 -1.42579,0.39063 -2.92969,1.21094 -0.0391,0.42969 -0.0586,0.83984 -0.0195,0.39063 -0.0195,0.9961 0,3.08593 0.625,4.88281 0.64453,1.77734 1.75782,2.8125 0.89843,0.85937 1.93359,1.26953 1.05469,0.39063 2.28516,0.39063 2.83203,0 4.45312,-1.71875 1.62109,-1.73829 1.62109,-4.98047 z"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "m 339.58231,97.285149 -13.16407,24.726561 -4.17968,0 14.0039,-25.664061 -16.5625,0 0,-3.417969 19.90235,0 0,4.355469 z"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "m 365.18777,113.90624 q 0,3.76953 -2.94921,6.26953 -2.92969,2.5 -7.38282,2.5 -4.72656,0 -7.53906,-2.4414 -2.79297,-2.44141 -2.79297,-6.25 0,-2.42188 1.40625,-4.375 1.40625,-1.97266 3.96485,-3.125 l 0,-0.11719 q -2.34375,-1.25 -3.47657,-2.73438 -1.11328,-1.48437 -1.11328,-3.710933 0,-3.28125 2.69531,-5.46875 2.69532,-2.1875 6.85547,-2.1875 4.35547,0 6.95313,2.089844 2.59765,2.089844 2.59765,5.3125 0,1.972659 -1.23046,3.886719 -1.23047,1.89453 -3.61329,2.96875 l 0,0.11719 q 2.73438,1.17187 4.17969,2.89062 1.44531,1.71875 1.44531,4.375 z m -4.6289,-14.199216 q 0,-2.089844 -1.6211,-3.320313 -1.60156,-1.25 -4.10156,-1.25 -2.46094,0 -4.04297,1.171875 -1.5625,1.171875 -1.5625,3.164063 0,1.406251 0.78125,2.441401 0.80078,1.01563 2.40235,1.81641 0.72265,0.35156 2.07031,0.91797 1.36719,0.56641 2.65625,0.9375 1.93359,-1.28906 2.67578,-2.67578 0.74219,-1.38672 0.74219,-3.203126 z m 0.60547,14.570316 q 0,-1.79688 -0.80078,-2.8711 -0.78125,-1.09375 -3.08594,-2.1875 -0.91797,-0.42969 -2.01172,-0.80078 -1.09375,-0.37109 -2.91016,-1.03516 -1.75781,0.95704 -2.83203,2.59766 -1.05469,1.64063 -1.05469,3.71094 0,2.63672 1.81641,4.35547 1.81641,1.71875 4.60938,1.71875 2.85156,0 4.55078,-1.46485 1.71875,-1.46484 1.71875,-4.02343 z"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "m 390.40262,105.72265 q 0,3.80859 -0.87891,6.91406 -0.85937,3.10547 -2.61719,5.29297 -1.77734,2.22656 -4.45312,3.4375 -2.67578,1.21094 -6.28906,1.21094 -1.01563,0 -1.91407,-0.11719 -0.89843,-0.0977 -1.60156,-0.33203 l 0,-3.73047 0.19531,0 q 0.56641,0.29297 1.60157,0.56641 1.03515,0.2539 2.30468,0.2539 4.31641,0 6.75782,-2.57812 2.46093,-2.59766 2.85156,-7.14844 -1.81641,1.09375 -3.41797,1.5625 -1.60156,0.46875 -3.49609,0.46875 -1.79688,0 -3.26172,-0.35156 -1.44531,-0.35157 -2.91016,-1.36719 -1.71875,-1.19141 -2.59765,-3.02734 -0.85938,-1.83594 -0.85938,-4.39454 0,-4.45312 2.92969,-7.246089 2.92969,-2.792969 7.14844,-2.792969 2.10937,0 3.90625,0.664063 1.79687,0.644531 3.14453,1.953125 1.66015,1.621094 2.55859,4.179687 0.89844,2.539063 0.89844,6.582033 z m -3.94531,-0.83985 q 0,-3.02734 -0.625,-4.86328 -0.625,-1.835934 -1.71875,-2.851559 -0.91797,-0.878906 -1.97266,-1.25 -1.05469,-0.390625 -2.28516,-0.390625 -2.8125,0 -4.45312,1.757813 -1.6211,1.757812 -1.6211,4.941401 0,1.85547 0.52735,3.02735 0.52734,1.17187 1.77734,2.05078 0.87891,0.60547 1.9336,0.82031 1.05468,0.19531 2.34375,0.19531 1.52343,0 3.08593,-0.41015 1.5625,-0.41016 2.92969,-1.19141 0.0195,-0.41015 0.0391,-0.80078 0.0391,-0.41016 0.0391,-1.03516 z"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "m 404.50418,105.76171 -4.66797,0 0,-5.56641 4.66797,0 0,5.56641 z m 0,16.25 -4.66797,0 0,-5.56641 4.66797,0 0,5.56641 z"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "m 422.70731,105.76171 -4.66797,0 0,-5.56641 4.66797,0 0,5.56641 z m 1.42578,10.68359 -5.50782,12.79297 -2.85156,0 3.39844,-12.79297 4.96094,0 z"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "m 456.98465,120.5078 -22.53906,-10.01953 0,-2.42187 22.53906,-10.019533 0,3.515623 -17.77344,7.71485 17.77344,7.71484 0,3.51562 z"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "m 490.16824,106.73827 -23.16406,0 0,-3.125 23.16406,0 0,3.125 z m 0,8.20313 -23.16406,0 0,-3.125 23.16406,0 0,3.125 z"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "m 522.72684,110.48827 -22.53907,10.01953 0,-3.51562 17.77344,-7.71484 -17.77344,-7.71485 0,-3.515623 22.53907,10.019533 0,2.42187 z"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "m 547.31668,99.765617 q 0,1.914063 -0.68359,3.417973 -0.6836,1.48437 -1.79688,2.63671 -1.09375,1.11329 -2.51953,2.08985 -1.42578,0.97656 -3.02734,1.89453 l 0,4.39453 -3.4961,0 0,-5.95703 q 1.26953,-0.72266 2.73438,-1.58203 1.48437,-0.85938 2.42187,-1.73828 1.13282,-1.01563 1.75782,-2.08985 0.625,-1.09375 0.625,-2.77343 0,-2.207035 -1.50391,-3.281254 -1.48438,-1.09375 -3.84766,-1.09375 -2.10937,0 -4.0039,0.664063 -1.875,0.664062 -2.96875,1.347656 l -0.19532,0 0,-3.984375 q 1.36719,-0.527344 3.45704,-0.9375 2.10937,-0.429688 3.98437,-0.429688 4.19922,0 6.62109,2.050782 2.44141,2.03125 2.44141,5.371093 z m -7.71484,22.246093 -3.98438,0 0,-4.12109 3.98438,0 0,4.12109 z"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "m 586.00809,109.06249 q 0,2.71485 -0.80078,5.25391 -0.78125,2.53906 -2.2461,4.6289 l -8.59375,0 -0.52734,-2.26562 q -1.44531,1.17187 -2.77344,1.79687 -1.32812,0.625 -3.04687,0.625 -3.28125,0 -5.25391,-2.48046 -1.95313,-2.48047 -1.95313,-6.9336 0,-4.43359 2.40235,-7.07031 2.40234,-2.636719 5.74219,-2.636719 1.42578,0 2.51953,0.332029 1.09375,0.3125 2.36328,0.95703 l 0,-0.9375 3.10547,0 0,16.44532 4.74609,0 q 0.82031,-1.46485 1.23047,-3.65235 0.42969,-2.20703 0.42969,-3.94531 0,-3.20313 -0.89844,-5.82031 -0.87891,-2.61719 -2.59766,-4.49219 -1.71875,-1.875 -4.25781,-2.871094 -2.53906,-1.015625 -5.76172,-1.015625 -3.125,0 -5.72265,1.132813 -2.57813,1.132812 -4.4336,3.046875 -1.875,1.914061 -2.94922,4.589841 -1.05468,2.65625 -1.05468,5.66406 0,3.22266 1.01562,5.89844 1.01563,2.65625 2.87109,4.55078 1.9336,1.97266 4.53125,2.96875 2.59766,1.01563 5.66407,1.01563 1.67968,0 3.45703,-0.21485 1.79687,-0.21484 3.4375,-0.68359 l 0,2.77344 q -1.89453,0.41015 -3.53516,0.54687 -1.64062,0.15625 -3.3789,0.15625 -3.63282,0 -6.73829,-1.25 -3.10546,-1.23047 -5.33203,-3.45703 -2.24609,-2.24609 -3.49609,-5.39062 -1.25,-3.14453 -1.25,-6.95313 0,-3.61328 1.30859,-6.71875 1.3086,-3.124998 3.57422,-5.410154 2.26563,-2.285156 5.3711,-3.59375 3.10546,-1.308594 6.64062,-1.308594 3.82813,0 6.83594,1.210938 3.00781,1.210937 5.07812,3.398437 2.07032,2.1875 3.16407,5.273433 1.11328,3.06641 1.11328,6.83594 z m -12.20703,4.98047 0,-10.11719 q -1.23047,-0.5664 -2.20704,-0.80078 -0.97656,-0.2539 -2.08984,-0.2539 -2.51953,0 -3.94531,1.75781 -1.42578,1.75781 -1.42578,5 0,3.18359 1.13281,4.82422 1.13281,1.62109 3.53516,1.62109 1.30859,0 2.61718,-0.60547 1.3086,-0.60547 2.38282,-1.42578 z"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "m 165.22684,172.01171 -4.1211,0 -2.85156,-8.10547 -12.57812,0 -2.85157,8.10547 -3.92578,0 10.58594,-29.08203 5.15625,0 10.58594,29.08203 z m -8.16407,-11.42578 -5.09765,-14.27734 -5.11719,14.27734 10.21484,0 z"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "m 191.57449,163.0664 q 0,2.16797 -0.82031,3.82812 -0.82031,1.66016 -2.20703,2.73438 -1.64063,1.28906 -3.61328,1.83594 -1.95313,0.54687 -4.98047,0.54687 l -10.3125,0 0,-29.08203 8.61328,0 q 3.18359,0 4.76563,0.23437 1.58203,0.23438 3.02734,0.97657 1.60156,0.83984 2.32422,2.16797 0.72265,1.30859 0.72265,3.14453 0,2.07031 -1.05468,3.53515 -1.05469,1.44532 -2.8125,2.32422 l 0,0.15625 q 2.94922,0.60547 4.64843,2.59766 1.69922,1.97265 1.69922,5 z m -6.5039,-13.10547 q 0,-1.05469 -0.35157,-1.77734 -0.35156,-0.72266 -1.13281,-1.17188 -0.91797,-0.52734 -2.22656,-0.64453 -1.30859,-0.13672 -3.24219,-0.13672 l -4.60937,0 0,8.39844 5,0 q 1.8164,0 2.89062,-0.17578 1.07422,-0.19532 1.99219,-0.78125 0.91797,-0.58594 1.28906,-1.50391 0.39063,-0.9375 0.39063,-2.20703 z m 2.48047,13.26172 q 0,-1.75781 -0.52735,-2.79297 -0.52734,-1.03516 -1.91406,-1.75781 -0.9375,-0.48828 -2.28516,-0.625 -1.32812,-0.15625 -3.24218,-0.15625 l -6.07422,0 0,10.82031 5.11718,0 q 2.53907,0 4.16016,-0.25391 1.62109,-0.27343 2.65625,-0.97656 1.09375,-0.76172 1.60156,-1.73828 0.50782,-0.97656 0.50782,-2.51953 z"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "m 219.52371,169.90234 q -1.07422,0.46875 -1.95312,0.8789 -0.85938,0.41016 -2.26563,0.85938 -1.1914,0.37109 -2.59765,0.625 -1.38672,0.27343 -3.06641,0.27343 -3.16406,0 -5.76172,-0.8789 -2.57812,-0.89844 -4.49219,-2.79297 -1.875,-1.85547 -2.92968,-4.70703 -1.05469,-2.8711 -1.05469,-6.66016 0,-3.59375 1.01562,-6.42578 1.01563,-2.83203 2.92969,-4.78516 1.85547,-1.89453 4.47266,-2.89062 2.63672,-0.99609 5.83984,-0.99609 2.34375,0 4.66797,0.5664 2.34375,0.56641 5.19531,1.99219 l 0,4.58984 -0.29297,0 q -2.40234,-2.01172 -4.76562,-2.92968 -2.36328,-0.91797 -5.0586,-0.91797 -2.20703,0 -3.98437,0.72265 -1.75781,0.70313 -3.14453,2.20703 -1.34766,1.46485 -2.10938,3.71094 -0.74218,2.22656 -0.74218,5.15625 0,3.06641 0.82031,5.27344 0.83984,2.20703 2.14844,3.59375 1.36718,1.44531 3.18359,2.14844 1.83594,0.68359 3.86719,0.68359 2.79297,0 5.23437,-0.95703 2.44141,-0.95703 4.57031,-2.87109 l 0.27344,0 0,4.53125 z"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "m 249.60184,157.49999 q 0,3.96485 -1.73828,7.1875 -1.71875,3.22266 -4.58985,5 -1.99219,1.23047 -4.45312,1.77735 -2.44141,0.54687 -6.44532,0.54687 l -7.34375,0 0,-29.08203 7.26563,0 q 4.25781,0 6.75781,0.625 2.51953,0.60547 4.25781,1.67969 2.96875,1.85547 4.62891,4.9414 1.66016,3.08594 1.66016,7.32422 z m -4.04297,-0.0586 q 0,-3.41797 -1.19141,-5.76172 -1.1914,-2.34375 -3.55469,-3.69141 -1.71875,-0.97656 -3.65234,-1.34765 -1.93359,-0.39063 -4.62891,-0.39063 l -3.63281,0 0,22.44141 3.63281,0 q 2.79297,0 4.86329,-0.41016 2.08984,-0.41015 3.82812,-1.52344 2.16797,-1.38671 3.24219,-3.65234 1.09375,-2.26562 1.09375,-5.66406 z"

    aput-object v2, v0, v1

    const/16 v1, 0x15

    const-string v2, "m 275.05106,172.01171 -19.16016,0 0,-29.08203 19.16016,0 0,3.4375 -15.29297,0 0,7.96875 15.29297,0 0,3.4375 -15.29297,0 0,10.80078 15.29297,0 0,3.4375 z"

    aput-object v2, v0, v1

    const/16 v1, 0x16

    const-string v2, "m 299.77762,146.36718 -14.70703,0 0,8.20312 12.63672,0 0,3.4375 -12.63672,0 0,14.00391 -3.86719,0 0,-29.08203 18.57422,0 0,3.4375 z"

    aput-object v2, v0, v1

    const/16 v1, 0x17

    const-string v2, "m 328.42996,169.86327 q -2.38281,1.09375 -5.21484,1.91407 -2.8125,0.80078 -5.44922,0.80078 -3.39844,0 -6.23047,-0.9375 -2.83203,-0.9375 -4.82422,-2.8125 -2.01172,-1.89453 -3.10547,-4.72657 -1.09375,-2.85156 -1.09375,-6.66015 0,-6.97266 4.0625,-10.9961 4.08203,-4.04296 11.19141,-4.04296 2.48047,0 5.05859,0.60546 2.59766,0.58594 5.58594,2.01172 l 0,4.58985 -0.35156,0 q -0.60547,-0.46875 -1.75781,-1.23047 -1.15235,-0.76172 -2.26563,-1.26953 -1.34766,-0.60547 -3.06641,-0.9961 -1.69921,-0.41015 -3.86718,-0.41015 -4.88282,0 -7.73438,3.14453 -2.83203,3.125 -2.83203,8.47656 0,5.64453 2.96875,8.78906 2.96875,3.125 8.08594,3.125 1.875,0 3.73047,-0.37109 1.875,-0.37109 3.28125,-0.95703 l 0,-7.12891 -7.79297,0 0,-3.39844 11.62109,0 0,12.48047 z"

    aput-object v2, v0, v1

    const/16 v1, 0x18

    const-string v2, "m 357.43387,172.01171 -3.86719,0 0,-14.23828 -14.51172,0 0,14.23828 -3.86719,0 0,-29.08203 3.86719,0 0,11.40625 14.51172,0 0,-11.40625 3.86719,0 0,29.08203 z"

    aput-object v2, v0, v1

    const/16 v1, 0x19

    const-string v2, "m 375.51981,172.01171 -11.48438,0 0,-2.96875 3.80859,0 0,-23.14453 -3.80859,0 0,-2.96875 11.48438,0 0,2.96875 -3.8086,0 0,23.14453 3.8086,0 0,2.96875 z"

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    const-string v2, "m 392.80496,164.45312 q 0,3.82812 -2.34375,5.89843 -2.32422,2.07032 -6.25,2.07032 -0.9375,0 -2.5,-0.17578 -1.5625,-0.15625 -2.61719,-0.39063 l 0,-3.61328 0.21485,0 q 0.80078,0.27344 1.97265,0.56641 1.17188,0.29296 2.40235,0.29296 1.79687,0 2.85156,-0.41015 1.07422,-0.41016 1.58203,-1.17188 0.52735,-0.78125 0.66406,-1.91406 0.15625,-1.13281 0.15625,-2.61719 l 0,-16.97265 -6.15234,0 0,-3.08594 10.01953,0 0,21.52344 z"

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    const-string v2, "m 423.72293,172.01171 -5.01953,0 -11.50391,-12.94922 -2.89062,3.08594 0,9.86328 -3.86719,0 0,-29.08203 3.86719,0 0,15.17578 14.12109,-15.17578 4.6875,0 -12.98828,13.67187 13.59375,15.41016 z"

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    const-string v2, "m 446.47684,172.01171 -18.39844,0 0,-29.08203 3.86719,0 0,25.64453 14.53125,0 0,3.4375 z"

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    const-string v2, "m 476.24246,172.01171 -3.86719,0 0,-25.05859 -8.08593,17.05078 -2.30469,0 -8.02734,-17.05078 0,25.05859 -3.61329,0 0,-29.08203 5.27344,0 7.75391,16.19141 7.5,-16.19141 5.37109,0 0,29.08203 z"

    aput-object v2, v0, v1

    const/16 v1, 0x1e

    const-string v2, "m 506.28152,172.01171 -4.78515,0 -13.78906,-26.01562 0,26.01562 -3.61329,0 0,-29.08203 5.9961,0 12.57812,23.75 0,-23.75 3.61328,0 0,29.08203 z"

    aput-object v2, v0, v1

    const/16 v1, 0x1f

    const-string v2, "m 535.69559,146.26952 q 1.77734,1.95313 2.71484,4.78516 0.95703,2.83203 0.95703,6.42578 0,3.59375 -0.97656,6.44531 -0.95703,2.83203 -2.69531,4.72657 -1.79688,1.97265 -4.25782,2.96875 -2.4414,0.99609 -5.58593,0.99609 -3.06641,0 -5.58594,-1.01563 -2.5,-1.01562 -4.25781,-2.94921 -1.75782,-1.9336 -2.71485,-4.7461 -0.9375,-2.8125 -0.9375,-6.42578 0,-3.55469 0.9375,-6.36719 0.9375,-2.83203 2.73438,-4.84375 1.71875,-1.91406 4.25781,-2.92968 2.55859,-1.01563 5.56641,-1.01563 3.125,0 5.60547,1.03516 2.5,1.01562 4.23828,2.91015 z m -0.35157,11.21094 q 0,-5.66406 -2.53906,-8.73047 -2.53906,-3.08594 -6.93359,-3.08594 -4.4336,0 -6.97266,3.08594 -2.51953,3.06641 -2.51953,8.73047 0,5.72266 2.57813,8.76953 2.57812,3.02735 6.91406,3.02735 4.33594,0 6.89453,-3.02735 2.57812,-3.04687 2.57812,-8.76953 z"

    aput-object v2, v0, v1

    const/16 v1, 0x20

    const-string v2, "m 564.52371,151.71874 q 0,1.9336 -0.68359,3.59375 -0.66406,1.64063 -1.875,2.85156 -1.50391,1.50391 -3.55469,2.26563 -2.05078,0.74219 -5.17578,0.74219 l -3.86719,0 0,10.83984 -3.86719,0 0,-29.08203 7.89063,0 q 2.61719,0 4.43359,0.44922 1.81641,0.42969 3.22266,1.36719 1.66016,1.11328 2.55859,2.77343 0.91797,1.66016 0.91797,4.19922 z m -4.02344,0.0977 q 0,-1.50391 -0.52734,-2.61719 -0.52734,-1.11328 -1.60156,-1.81641 -0.9375,-0.60546 -2.14844,-0.85937 -1.19141,-0.27344 -3.02734,-0.27344 l -3.82813,0 0,11.6211 3.26172,0 q 2.34375,0 3.80859,-0.41016 1.46485,-0.42969 2.38282,-1.34766 0.91797,-0.9375 1.28906,-1.97265 0.39062,-1.03516 0.39062,-2.32422 z"

    aput-object v2, v0, v1

    const/16 v1, 0x21

    const-string v2, "m 595.5784,179.14062 q -1.17188,0.29297 -2.32422,0.41015 -1.13281,0.13672 -2.32422,0.13672 -3.39844,0 -5.46875,-1.875 -2.05078,-1.85547 -2.22656,-5.33203 -0.46875,0.0781 -0.91797,0.0977 -0.42969,0.0391 -0.83984,0.0391 -3.06641,0 -5.58594,-1.01563 -2.5,-1.01562 -4.25781,-2.94921 -1.75782,-1.9336 -2.71485,-4.7461 -0.9375,-2.8125 -0.9375,-6.42578 0,-3.55469 0.9375,-6.36719 0.9375,-2.83203 2.73438,-4.84375 1.71875,-1.91406 4.25781,-2.92968 2.55859,-1.01563 5.56641,-1.01563 3.125,0 5.60547,1.03516 2.5,1.01562 4.23828,2.91015 1.77734,1.95313 2.71484,4.78516 0.95703,2.83203 0.95703,6.42578 0,5.33203 -2.1875,8.98438 -2.16797,3.65234 -5.83984,5.11718 0.0781,2.22657 1.05469,3.45703 0.97656,1.23047 3.55468,1.23047 0.80078,0 1.89453,-0.2539 1.11329,-0.23438 1.58204,-0.42969 l 0.52734,0 0,3.55469 z m -4.60938,-21.66016 q 0,-5.66406 -2.53906,-8.73047 -2.53906,-3.08594 -6.93359,-3.08594 -4.4336,0 -6.97266,3.08594 -2.51953,3.06641 -2.51953,8.73047 0,5.72266 2.57813,8.76953 2.57812,3.02735 6.91406,3.02735 4.33594,0 6.89453,-3.02735 2.57812,-3.04687 2.57812,-8.76953 z"

    aput-object v2, v0, v1

    const/16 v1, 0x22

    const-string v2, "m 625.18777,172.01171 -5.01953,0 -9.72656,-11.5625 -5.44922,0 0,11.5625 -3.86719,0 0,-29.08203 8.14454,0 q 2.63671,0 4.39453,0.35156 1.75781,0.33203 3.16406,1.21094 1.58203,0.99609 2.46094,2.51953 0.89843,1.50391 0.89843,3.82813 0,3.14453 -1.58203,5.27343 -1.58203,2.10938 -4.35547,3.1836 l 10.9375,12.71484 z m -9.04296,-20.89844 q 0,-1.25 -0.44922,-2.20703 -0.42969,-0.97656 -1.44532,-1.64062 -0.83984,-0.56641 -1.99218,-0.78125 -1.15235,-0.23438 -2.71485,-0.23438 l -4.55078,0 0,10.97656 3.90625,0 q 1.83594,0 3.20313,-0.3125 1.36718,-0.33203 2.32422,-1.21093 0.8789,-0.82032 1.28906,-1.875 0.42969,-1.07422 0.42969,-2.71485 z"

    aput-object v2, v0, v1

    const/16 v1, 0x23

    const-string v2, "m 163.42996,213.71093 q 0,1.69922 -0.80078,3.35937 -0.78125,1.66016 -2.20703,2.8125 -1.5625,1.25 -3.65234,1.95313 -2.07032,0.70312 -5,0.70312 -3.14454,0 -5.66407,-0.58593 -2.5,-0.58594 -5.09765,-1.73828 l 0,-4.84375 0.27343,0 q 2.20704,1.83593 5.09766,2.83203 2.89063,0.99609 5.42969,0.99609 3.59375,0 5.58594,-1.34766 2.01171,-1.34765 2.01171,-3.59375 0,-1.93359 -0.95703,-2.85156 -0.9375,-0.91797 -2.87109,-1.42578 -1.46484,-0.39062 -3.18359,-0.64453 -1.69922,-0.25391 -3.61329,-0.64453 -3.86718,-0.82031 -5.74218,-2.79297 -1.85547,-1.99219 -1.85547,-5.17578 0,-3.65235 3.08594,-5.97656 3.08593,-2.34375 7.83203,-2.34375 3.0664,0 5.625,0.58593 2.55859,0.58594 4.53125,1.44532 l 0,4.57031 -0.27344,0 q -1.66016,-1.40625 -4.375,-2.32422 -2.69531,-0.9375 -5.52734,-0.9375 -3.10547,0 -5,1.28906 -1.875,1.28906 -1.875,3.32031 0,1.81641 0.9375,2.85157 0.9375,1.03515 3.30078,1.58203 1.25,0.27344 3.55468,0.66406 2.30469,0.39063 3.90625,0.80078 3.24219,0.85938 4.88282,2.59766 1.64062,1.73828 1.64062,4.86328 z"

    aput-object v2, v0, v1

    const/16 v1, 0x24

    const-string v2, "m 190.38309,196.36718 -10.39063,0 0,25.64453 -3.86719,0 0,-25.64453 -10.39062,0 0,-3.4375 24.64844,0 0,3.4375 z"

    aput-object v2, v0, v1

    const/16 v1, 0x25

    const-string v2, "m 216.22293,210.33202 q 0,3.16407 -0.70312,5.52735 -0.6836,2.34375 -2.26563,3.90625 -1.50391,1.48437 -3.51562,2.16797 -2.01172,0.68359 -4.6875,0.68359 -2.73438,0 -4.76563,-0.72266 -2.03125,-0.72265 -3.41797,-2.1289 -1.58203,-1.60157 -2.28515,-3.86719 -0.6836,-2.26563 -0.6836,-5.56641 l 0,-17.40234 3.86719,0 0,17.59766 q 0,2.36328 0.3125,3.73046 0.33203,1.36719 1.09375,2.48047 0.85937,1.26953 2.32422,1.91407 1.48437,0.64453 3.55469,0.64453 2.08984,0 3.55468,-0.625 1.46485,-0.64453 2.34375,-1.9336 0.76172,-1.11328 1.07422,-2.53906 0.33203,-1.44531 0.33203,-3.57422 l 0,-17.69531 3.86719,0 0,17.40234 z"

    aput-object v2, v0, v1

    const/16 v1, 0x26

    const-string v2, "m 246.55496,192.92968 -10.58594,29.08203 -5.15625,0 -10.58593,-29.08203 4.14062,0 9.1211,25.58594 9.12109,-25.58594 3.94531,0 z"

    aput-object v2, v0, v1

    const/16 v1, 0x27

    const-string v2, "m 284.81668,192.92968 -7.55859,29.08203 -4.35547,0 -6.11328,-24.14062 -5.97657,24.14062 -4.25781,0 -7.69531,-29.08203 3.96484,0 6.11328,24.17969 6.01563,-24.17969 3.92578,0 6.07422,24.41406 6.07422,-24.41406 3.78906,0 z"

    aput-object v2, v0, v1

    const/16 v1, 0x28

    const-string v2, "m 312.68777,192.92968 -10.03906,14.375 10.01953,14.70703 -4.47265,0 -7.92969,-11.97266 -8.125,11.97266 -4.21875,0 10.13672,-14.53125 -9.90235,-14.55078 4.45313,0 7.83203,11.81641 8.00781,-11.81641 4.23828,0 z"

    aput-object v2, v0, v1

    const/16 v1, 0x29

    const-string v2, "m 338.50809,192.92968 -10.23438,16.32812 0,12.75391 -3.86719,0 0,-12.34375 -10.27343,-16.73828 4.27734,0 7.94922,13.00781 8.02734,-13.00781 4.1211,0 z"

    aput-object v2, v0, v1

    const/16 v1, 0x2a

    const-string v2, "m 363.78152,222.01171 -22.69531,0 0,-3.59375 17.83203,-22.05078 -17.16797,0 0,-3.4375 21.60157,0 0,3.49609 -18.00782,22.14844 18.4375,0 0,3.4375 z"

    aput-object v2, v0, v1

    .line 113
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->svgPathData48to90:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 27
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->radius:F

    const/4 v1, 0x0

    .line 30
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->rotationMeasure:Ljava/lang/String;

    .line 31
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->measureMul:F

    const/4 v1, 0x0

    .line 32
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->angleAculumator:F

    .line 33
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->counter:F

    .line 34
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const-string v3, "{ArtistOrTitle}"

    invoke-direct {v2, v3, v0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->measureText:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    .line 36
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    .line 37
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->vec:Lcom/daaw/avee/Common/Vec2f;

    .line 105
    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->createAscii48to90()Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;

    .line 106
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;

    .line 109
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->currentCharIndex:I

    const/4 v0, 0x3

    .line 160
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->setSides(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;

    return-void
.end method

.method private createPaths(Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;[Ljava/lang/String;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    .line 181
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count()I

    move-result v3

    array-length v4, v1

    if-eq v3, v4, :cond_0

    const-string v3, "charSet count don\'t match"

    .line 182
    invoke-static {v3}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 184
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count()I

    move-result v3

    array-length v4, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    new-array v3, v3, [Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;

    iput-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;

    .line 187
    new-instance v3, Landroid/graphics/PathMeasure;

    invoke-direct {v3}, Landroid/graphics/PathMeasure;-><init>()V

    .line 191
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x2

    new-array v6, v5, [F

    .line 193
    fill-array-data v6, :array_0

    new-array v5, v5, [F

    .line 194
    fill-array-data v5, :array_1

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 196
    :goto_0
    iget-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;

    array-length v9, v9

    if-ge v8, v9, :cond_9

    const/4 v9, 0x0

    .line 198
    iput v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->totalPathLength:F

    .line 199
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 201
    aget-object v10, v1, v8

    invoke-static {v10}, Lcom/larvalabs/svgandroid/SVGParser;->parsePath(Ljava/lang/String;)Landroid/graphics/Path;

    move-result-object v10

    .line 202
    invoke-virtual {v3, v10, v7}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 205
    :cond_1
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v11

    .line 206
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    iget v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->totalPathLength:F

    add-float/2addr v12, v11

    iput v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->totalPathLength:F

    .line 208
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->nextContour()Z

    move-result v11

    if-nez v11, :cond_1

    .line 210
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;

    invoke-direct {v11, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;I)V

    .line 212
    invoke-virtual {v3, v10, v7}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 217
    iget v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->totalPathLength:F

    int-to-float v12, v2

    div-float/2addr v10, v12

    .line 219
    iget-object v12, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->indexContourGaps:Ljava/util/List;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v2, :cond_8

    int-to-float v13, v12

    mul-float v13, v13, v10

    .line 224
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v14

    add-float/2addr v14, v9

    cmpl-float v15, v13, v14

    if-lez v15, :cond_3

    .line 227
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->nextContour()Z

    move-result v9

    if-nez v9, :cond_2

    const-string v9, "could get all points on path"

    .line 228
    invoke-static {v9}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 231
    :cond_2
    iget-object v9, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->indexContourGaps:Ljava/util/List;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v9, v14

    goto :goto_1

    :cond_3
    sub-float/2addr v13, v9

    .line 235
    invoke-virtual {v3, v13, v6, v5}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 237
    iget v13, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->totalPathLength:F

    iput v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->length:F

    .line 238
    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v14, Lcom/daaw/avee/Common/Vec2f;

    aget v15, v6, v7

    const/16 v16, 0x1

    aget v7, v6, v16

    invoke-direct {v14, v15, v7}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v14, v13, v12

    .line 239
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->tans:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v13, Lcom/daaw/avee/Common/Vec2f;

    const/4 v14, 0x0

    aget v15, v5, v14

    aget v14, v5, v16

    invoke-direct {v13, v15, v14}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v13, v7, v12

    .line 240
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->tans:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v7, v7, v12

    invoke-virtual {v7}, Lcom/daaw/avee/Common/Vec2f;->normalize()Lcom/daaw/avee/Common/Vec2f;

    .line 242
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    cmpl-float v7, v7, v13

    if-lez v7, :cond_4

    .line 243
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v13, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 244
    :cond_4
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    cmpl-float v7, v7, v13

    if-lez v7, :cond_5

    .line 245
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v13, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 247
    :cond_5
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    cmpg-float v7, v7, v13

    if-gez v7, :cond_6

    .line 248
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v13, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 249
    :cond_6
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    cmpg-float v7, v7, v13

    if-gez v7, :cond_7

    .line 250
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v13, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    :cond_7
    add-int/lit8 v12, v12, 0x1

    const/4 v7, 0x0

    goto/16 :goto_1

    .line 255
    :cond_8
    :goto_2
    invoke-virtual {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->finishInit()V

    .line 256
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;

    aput-object v11, v7, v8

    add-int/lit8 v8, v8, 0x1

    const/4 v7, 0x0

    goto/16 :goto_0

    :cond_9
    return-void

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
    .end array-data
.end method


# virtual methods
.method public getPathLength(Landroid/graphics/RectF;I)F
    .locals 2

    .line 440
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;

    array-length v1, v0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    array-length v0, v0

    if-eq v0, p2, :cond_1

    .line 441
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->svgPathData48to90:[Ljava/lang/String;

    invoke-direct {p0, v0, v1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->createPaths(Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;[Ljava/lang/String;I)V

    .line 442
    :cond_1
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->currentCharIndex:I

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;

    array-length v1, v0

    if-ge p2, v1, :cond_2

    .line 443
    aget-object p2, v0, p2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_3

    const/high16 p1, 0x3f800000    # 1.0f

    return p1

    .line 448
    :cond_3
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 449
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 450
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 451
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 454
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 455
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p1

    goto :goto_1

    .line 457
    :cond_4
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    .line 460
    :goto_1
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 461
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    goto :goto_2

    .line 463
    :cond_5
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    .line 465
    :goto_2
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->getLength()F

    move-result p2

    div-float/2addr p2, v0

    mul-float p2, p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    mul-float p2, p2, p1

    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->radius:F

    mul-float p2, p2, p1

    return p2
.end method

.method public getPointOnPath(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I
    .locals 2

    const/4 p1, 0x0

    .line 348
    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;

    array-length v0, p5

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    aget-object p5, p5, v0

    iget-object p5, p5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    array-length p5, p5

    if-eq p5, p3, :cond_1

    .line 349
    :cond_0
    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->svgPathData48to90:[Ljava/lang/String;

    invoke-direct {p0, p5, v0, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->createPaths(Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;[Ljava/lang/String;I)V

    .line 350
    :cond_1
    iget p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->currentCharIndex:I

    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;

    array-length v0, p5

    if-ge p3, v0, :cond_2

    .line 351
    aget-object p1, p5, p3

    :cond_2
    if-nez p1, :cond_3

    const/high16 p1, 0x3f800000    # 1.0f

    .line 356
    iput p1, p7, Landroid/graphics/PointF;->x:F

    const/4 p1, 0x0

    .line 357
    iput p1, p7, Landroid/graphics/PointF;->y:F

    .line 358
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    move-result p1

    iput p1, p6, Landroid/graphics/PointF;->x:F

    .line 359
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    iput p1, p6, Landroid/graphics/PointF;->y:F

    const/4 p1, -0x1

    return p1

    .line 363
    :cond_3
    iget-object p3, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object p3, p3, p2

    .line 364
    iget-object p5, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->tans:[Lcom/daaw/avee/Common/Vec2f;

    aget-object p5, p5, p2

    .line 366
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 367
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 368
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 369
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 396
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->vec:Lcom/daaw/avee/Common/Vec2f;

    iget v1, p5, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 397
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->vec:Lcom/daaw/avee/Common/Vec2f;

    iget p5, p5, Lcom/daaw/avee/Common/Vec2f;->x:F

    neg-float p5, p5

    iput p5, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 407
    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->width()F

    move-result p5

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpl-float p5, p5, v0

    if-lez p5, :cond_4

    .line 408
    iget p5, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    sub-float/2addr p5, v0

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    div-float/2addr p5, v0

    iput p5, p6, Landroid/graphics/PointF;->x:F

    .line 409
    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    move-result p5

    sub-float/2addr p3, p5

    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->width()F

    move-result p5

    div-float/2addr p3, p5

    iput p3, p6, Landroid/graphics/PointF;->y:F

    goto :goto_0

    .line 411
    :cond_4
    iget p5, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    sub-float/2addr p5, v0

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    div-float/2addr p5, v0

    iput p5, p6, Landroid/graphics/PointF;->x:F

    .line 412
    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    move-result p5

    sub-float/2addr p3, p5

    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->height()F

    move-result p5

    div-float/2addr p3, p5

    iput p3, p6, Landroid/graphics/PointF;->y:F

    .line 418
    :goto_0
    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result p3

    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    move-result p5

    cmpg-float p3, p3, p5

    if-gez p3, :cond_5

    .line 419
    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result p3

    goto :goto_1

    .line 421
    :cond_5
    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    move-result p3

    :goto_1
    const/high16 p5, 0x3f000000    # 0.5f

    mul-float p3, p3, p5

    .line 423
    iget p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->radius:F

    mul-float p3, p3, p5

    .line 425
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    move-result p5

    iget v0, p6, Landroid/graphics/PointF;->x:F

    mul-float v0, v0, p3

    add-float/2addr p5, v0

    iput p5, p6, Landroid/graphics/PointF;->x:F

    .line 426
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    move-result p4

    iget p5, p6, Landroid/graphics/PointF;->y:F

    mul-float p5, p5, p3

    add-float/2addr p4, p5

    iput p4, p6, Landroid/graphics/PointF;->y:F

    .line 428
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->vec:Lcom/daaw/avee/Common/Vec2f;

    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    neg-float p3, p3

    iput p3, p7, Landroid/graphics/PointF;->x:F

    .line 429
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->vec:Lcom/daaw/avee/Common/Vec2f;

    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    neg-float p3, p3

    iput p3, p7, Landroid/graphics/PointF;->y:F

    .line 432
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter$CharPathEntry;->getLastIndexOfContour(I)I

    move-result p1

    return p1
.end method

.method public getPreferredPointCount(Landroid/graphics/RectF;)I
    .locals 0

    const/4 p1, 0x2

    return p1
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    .line 475
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->radius:F

    const-string v1, "radius"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->radius:F

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 6

    .line 480
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->radius:F

    const-string v1, "radius"

    const-string v3, "misc"

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x40400000    # 3.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public process(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V
    .locals 2

    .line 320
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->measureText:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureText(Lcom/daaw/avee/comp/Visualizer/Meter;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 322
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    goto :goto_1

    :cond_1
    :goto_0
    const/16 p1, 0x58

    .line 327
    :goto_1
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->getIndexByChar(C)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->currentCharIndex:I

    return-void
.end method

.method public setRadius(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;
    .locals 0

    .line 301
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->radius:F

    return-object p0
.end method

.method public setRotationMeasure(Ljava/lang/String;F)V
    .locals 0

    .line 313
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->rotationMeasure:Ljava/lang/String;

    .line 314
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->measureMul:F

    return-void
.end method

.method public setSides(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;
    .locals 1

    int-to-float p1, p1

    const v0, 0x40c90fdb

    div-float/2addr v0, p1

    .line 308
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/_SegmentPathLetter;->sideInAngle:F

    return-object p0
.end method
