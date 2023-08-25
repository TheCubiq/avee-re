.class public Lcom/daaw/o5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/o5;->a:Ljava/util/List;

    sget-object v0, Lcom/daaw/avee/SettingsActivity;->r:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/o5$a;

    invoke-direct {v1, p0}, Lcom/daaw/o5$a;-><init>(Lcom/daaw/o5;)V

    iget-object v2, p0, Lcom/daaw/o5;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static a(Landroid/app/Activity;)I
    .locals 3

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    const-string v1, "pref_appTheme"

    const-string v2, "0"

    invoke-virtual {v0, p0, v1, v2}, Lcom/daaw/j5;->O(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/br1;->w(Ljava/lang/String;)I

    move-result p0

    packed-switch p0, :pswitch_data_0

    const p0, 0x7f11000e

    return p0

    :pswitch_0
    const p0, 0x7f110020

    return p0

    :pswitch_1
    const p0, 0x7f11001e

    return p0

    :pswitch_2
    const p0, 0x7f11001c

    return p0

    :pswitch_3
    const p0, 0x7f11001a

    return p0

    :pswitch_4
    const p0, 0x7f110018

    return p0

    :pswitch_5
    const p0, 0x7f110016

    return p0

    :pswitch_6
    const p0, 0x7f110014

    return p0

    :pswitch_7
    const p0, 0x7f110012

    return p0

    :pswitch_8
    const p0, 0x7f110010

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
