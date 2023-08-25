.class public final Lcom/daaw/ii2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ps7;


# static fields
.field public static final a:Lcom/daaw/ps7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ii2;

    invoke-direct {v0}, Lcom/daaw/ii2;-><init>()V

    sput-object v0, Lcom/daaw/ii2;->a:Lcom/daaw/ps7;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
