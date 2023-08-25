.class public final Lcom/daaw/vq0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/vq0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/daaw/nm1;

.field public final b:Lcom/daaw/tm1;

.field public final c:Lcom/daaw/sm1;

.field public d:I


# direct methods
.method public constructor <init>(Lcom/daaw/nm1;Lcom/daaw/tm1;Lcom/daaw/sm1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vq0$b;->a:Lcom/daaw/nm1;

    iput-object p2, p0, Lcom/daaw/vq0$b;->b:Lcom/daaw/tm1;

    iput-object p3, p0, Lcom/daaw/vq0$b;->c:Lcom/daaw/sm1;

    return-void
.end method
