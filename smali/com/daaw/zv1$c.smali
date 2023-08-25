.class public final Lcom/daaw/zv1$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/zv1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(ZIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/daaw/zv1$c;->a:Z

    iput p2, p0, Lcom/daaw/zv1$c;->b:I

    iput p3, p0, Lcom/daaw/zv1$c;->c:I

    iput p4, p0, Lcom/daaw/zv1$c;->d:I

    return-void
.end method
