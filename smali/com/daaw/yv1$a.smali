.class public final Lcom/daaw/yv1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yv1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/daaw/zv1$d;

.field public final b:Lcom/daaw/zv1$b;

.field public final c:[B

.field public final d:[Lcom/daaw/zv1$c;

.field public final e:I


# direct methods
.method public constructor <init>(Lcom/daaw/zv1$d;Lcom/daaw/zv1$b;[B[Lcom/daaw/zv1$c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yv1$a;->a:Lcom/daaw/zv1$d;

    iput-object p2, p0, Lcom/daaw/yv1$a;->b:Lcom/daaw/zv1$b;

    iput-object p3, p0, Lcom/daaw/yv1$a;->c:[B

    iput-object p4, p0, Lcom/daaw/yv1$a;->d:[Lcom/daaw/zv1$c;

    iput p5, p0, Lcom/daaw/yv1$a;->e:I

    return-void
.end method
