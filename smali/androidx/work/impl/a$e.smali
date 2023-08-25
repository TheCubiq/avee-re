.class public Landroidx/work/impl/a$e;
.super Lcom/daaw/gq0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/gq0;-><init>(II)V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/ji1;)V
    .locals 1

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)"

    invoke-interface {p1, v0}, Lcom/daaw/ji1;->h(Ljava/lang/String;)V

    return-void
.end method
