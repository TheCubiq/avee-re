.class public Lcom/daaw/fx$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/fx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Lcom/daaw/gx;

.field public final b:Lcom/daaw/b51;


# direct methods
.method public constructor <init>(Lcom/daaw/b51;Lcom/daaw/gx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fx$c;->b:Lcom/daaw/b51;

    iput-object p2, p0, Lcom/daaw/fx$c;->a:Lcom/daaw/gx;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fx$c;->a:Lcom/daaw/gx;

    iget-object v1, p0, Lcom/daaw/fx$c;->b:Lcom/daaw/b51;

    invoke-virtual {v0, v1}, Lcom/daaw/gx;->l(Lcom/daaw/b51;)V

    return-void
.end method
