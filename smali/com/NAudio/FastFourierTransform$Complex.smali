.class public Lcom/NAudio/FastFourierTransform$Complex;
.super Ljava/lang/Object;
.source "FastFourierTransform.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/NAudio/FastFourierTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Complex"
.end annotation


# instance fields
.field public X:F

.field public Y:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput p1, p0, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    .line 48
    iput p2, p0, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    return-void
.end method


# virtual methods
.method public im()F
    .locals 1

    .line 57
    iget v0, p0, Lcom/NAudio/FastFourierTransform$Complex;->Y:F

    return v0
.end method

.method public re()F
    .locals 1

    .line 52
    iget v0, p0, Lcom/NAudio/FastFourierTransform$Complex;->X:F

    return v0
.end method
